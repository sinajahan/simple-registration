Simple Registration
===================
A sample app registration app.

Run the tests
----------------

```bash
	mvn test
```

Run the app
-------------------

```bash
	mvn test tomcat7:run
```
and then point your browser to http://localhost:8080/

Technologies used
-----------------
* Spring MVC 4
* HSQL for avoiding the hassle of db setup
* Thymeleaf, Bootstrap
* JPA 2
* JUnit/Mockito
* Spring Security


Things That I cut because of time
---------------------------------
* Remove some unused stuff in pom file that maven archetype put there.
* Unit Tests for the custom validator
* Deployment pipeline
* Consider using the css pre processor like sass
* There are still some English text that I should move to i18n
* Adding spring security for password encryption and session management.
