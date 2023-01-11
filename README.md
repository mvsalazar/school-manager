# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.school-manager' is invalid and this project uses 'com.example.schoolmanager' instead.
* This project uses Gradle as its build system, you will need to install it as a requirement. For instructions checkout the [Gradle Installation Guide](https://docs.gradle.org/current/userguide/installation.html#installation).

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/gradle-plugin/reference/html/#build-image)
* [Mustache](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


---

# Running the app

```
./gradlew bootRun
```

# Example curl commands

## Adding a school
```
curl 'http://localhost:8080/add' -d name="Example Elementary" -d location="San Francisco, CA"
```

## Fetching all schools
```
curl 'http://localhost:8080/api/school/all'
```
