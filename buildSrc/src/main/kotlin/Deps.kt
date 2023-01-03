import org.gradle.api.JavaVersion

object Deps {
    val javaVersion = JavaVersion.VERSION_17
    const val kotlinJVMVersion = "1.7.22"

    object Plugin {
        object SpringBoot {
            const val id = "org.springframework.boot"
            const val version = "3.0.2-SNAPSHOT"
        }

        object SpringDependencyManagement {
            const val id = "io.spring.dependency-management"
            const val version = "1.1.0"
        }

        object KotlinJVM {
            const val id = "jvm"
            const val version = kotlinJVMVersion
        }

        object KotlinSpring {
            const val id = "plugin.spring"
            const val version = kotlinJVMVersion
        }
    }

    object SpringBoot {
        const val starter = "org.springframework.boot:spring-boot-starter"
        const val devTools = "org.springframework.boot:spring-boot-devtools"
        const val starterTest = "org.springframework.boot:spring-boot-starter-test"
        const val starterWeb = "org.springframework.boot:spring-boot-starter-web"
    }
}