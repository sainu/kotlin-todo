import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id(Deps.Plugin.SpringBoot.id) version Deps.Plugin.SpringBoot.version
	id(Deps.Plugin.SpringDependencyManagement.id) version Deps.Plugin.SpringDependencyManagement.version
	kotlin(Deps.Plugin.KotlinJVM.id) version Deps.Plugin.KotlinJVM.version
	kotlin(Deps.Plugin.KotlinSpring.id) version Deps.Plugin.KotlinSpring.version
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = Deps.javaVersion

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
	// Standard libraries
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	// Spring Boot
	implementation(Deps.SpringBoot.starter)
	implementation(Deps.SpringBoot.starterWeb)

	// Dev tools
	developmentOnly(Deps.SpringBoot.devTools)

	// Testing libraries
	testImplementation(Deps.SpringBoot.starterTest)
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = Deps.javaVersion.toString()
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
