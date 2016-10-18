# spring-learning
Step by step spring learning capture!

Spring version: 4.3.3.RELEASE

### Spring reference documentation
```
http://docs.spring.io/spring/docs/current/spring-framework-reference/pdf/spring-framework-reference.pdf
```
### Spring boot sample
- Build
```
gradle build
```
- Run
```
grandle bootRun
java -jar build/libs/spring-boot-sample-0.0.1-SNAPSHOT.jar
```
- Test summary
```
file://<path to spring boot sample>build/reports/tests/index.html
```
### Spring boot sample with web request/response
- Reference
```
http://projects.spring.io/spring-boot/#quick-start
```
- Dependency
```
compile("org.springframework.boot:spring-boot-starter-web:${springBootVersion}")
```
- Run
```
grandle bootRun
http://localhost:8080/
```
