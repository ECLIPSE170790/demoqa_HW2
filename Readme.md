Test_1707

dependecies {
testImplementation (
"com.codeborne:selenide:5.20.3",
"org.junit.jupiter:junit-jupiter-api:5.7.1")
testRuntimeOnly "org.junit.jupiter:junit-jupiter-engine:5.7.1"
}

test{
useJUnitPlatform()
}
