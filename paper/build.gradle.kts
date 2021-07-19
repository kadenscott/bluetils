dependencies {
    api(project(":bluetils-core"))

    compileOnlyApi(libs.paper.api) {
        exclude(module = "guava")
        exclude(module = "gson")
        exclude(module = "snakeyaml")
        exclude(module = "commons-lang")
    }

    constraints {
        api(libs.jdbi.bom)
    }

    implementation(libs.hikari)
    implementation(libs.jdbi.core)
    implementation(libs.lettuce)
    implementation(libs.postgresql)
}
