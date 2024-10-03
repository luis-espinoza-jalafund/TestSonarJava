plugins {
    id("java")
    id("org.sonarqube") version "4.4.1.3373"
}

sonar {
    properties {
        property("sonar.projectKey", "luis-espinoza-jalafund_TestSonarJava")
        property("sonar.organization", "sonar-cloud-test-dev6")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
