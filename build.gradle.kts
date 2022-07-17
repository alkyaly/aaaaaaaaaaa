plugins {
    id("org.quiltmc.loom") version "0.12.+"
    `maven-publish`
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(17))

val mcVersion: String by project
val loaderVersion: String by project
val qslVersion: String by project
val quiltedFapiVersion: String by project

val parchmentVersion: String by project
val qmVersion: String by project

val archivesBaseName: String by project
val version: String by project
val group: String by project

project.base.archivesName.set(archivesBaseName)
project.version = version
project.group = group

repositories {
    mavenLocal()
    maven {
        name = "Parchment"
        url = uri("https://maven.parchmentmc.org")
        content {
            includeGroup("org.parchmentmc.data")
        }
    }
}

dependencies {
    minecraft("com.mojang:minecraft:$mcVersion")

    mappings(loom.layered {
        addLayer(quiltMappings.mappings("org.quiltmc:quilt-mappings:$mcVersion+build.$qmVersion:v2"))
        parchment("org.parchmentmc.data:parchment-$mcVersion:$parchmentVersion")
        officialMojangMappings {
            nameSyntheticMembers = false
        }
    })

    modImplementation("org.quiltmc:quilt-loader:$loaderVersion")

    modImplementation("org.quiltmc.quilted-fabric-api:quilted-fabric-api:$quiltedFapiVersion-$mcVersion")
    modImplementation("org.quiltmc:qsl:$qslVersion+$mcVersion")
}

tasks.processResources {
    inputs.property("version", version)

    filesMatching("quilt.mod.json") {
        expand("version" to version)
    }
}

tasks.withType(JavaCompile::class).configureEach {
    options.encoding = "UTF-8"
    options.release.set(17)
}

java {
    withSourcesJar()
}

tasks.jar {
    from("LICENSE")
}