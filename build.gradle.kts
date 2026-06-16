import org.jetbrains.intellij.platform.gradle.TestFrameworkType
import org.jetbrains.intellij.platform.gradle.tasks.GenerateLexerTask

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.changelog")
    id("org.jetbrains.intellij.platform")
}

sourceSets.getByName("main") {
    java {
        srcDir("src/main/gen")
    }
}


dependencies {
    testImplementation(libs.junit)

    intellijPlatform {
        intellijIdea("2026.1.3")
        testFramework(TestFrameworkType.Platform)
    }
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.12.2")
    testRuntimeOnly("org.junit.platform:junit-platform-engine:1.12.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.12.2")
}



val lexers = listOf(
    Triple("roc", "roc", "src/main/kotlin/roc/lexer/Roc.flex"),
)

lexers.forEach { (lexerName, folder, lexerPath) ->
    project.tasks.register<GenerateLexerTask>("${lexerName}Lexer") {
        sourceFile = file(lexerPath)
        targetRootOutputDir = file("src/main/gen")
        purgeOldFiles.set(false)
        doLast {
            // post-process generated lexer files to match the output of the "Run JFlex Generator" action in IDEA
            val flexFileName = file(lexerPath).name
            file("src/main/gen").walk()
                .filter { it.extension == "java" }
                .forEach { javaFile ->
                    val original = javaFile.readText()
                    val normalized = original.replace(
                        "// source: $lexerPath",
                        "// source: $flexFileName"
                    )
                    if (normalized != original) javaFile.writeText(normalized)
                }
        }
    }
}