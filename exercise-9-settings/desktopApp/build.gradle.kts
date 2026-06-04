import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

dependencies {
    implementation(projects.shared)

    implementation(compose.desktop.currentOs)
    implementation(libs.kotlinx.coroutinesSwing)

    implementation(libs.compose.uiToolingPreview)

    // Koin
    implementation("io.insert-koin:koin-core:4.0.0")

    implementation("com.russhwolf:multiplatform-settings-no-arg:1.1.1")

    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.8.0")
}

compose.desktop {
    application {
        mainClass = "com.example.block_2.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.example.block_2"
            packageVersion = "1.0.0"
        }
    }
}