## Starting Spring Boot with MySQL Database

**What You Will Build**

    You will create a MySQL database, build a Spring application, and connect it to the newly created database

**What You Need**

    .MySQL version 5.6 or better. If you have Docker installed, it might be useful to run the database as a container.

    .JDK 1.8 or later

    .Gradle 4+ or Maven 3.2+

    .You can also import the code straight into your IDE:

        .Spring Tool Suite (STS)
        
        .IntelliJ IDEA

**Starting with Spring Initializr**

    1.Navigate to https://start.spring.io. This service pulls in all the dependencies you need for an application and does most of the setup for you.
    
    2.Choose either Gradle or Maven and the language you want to use. This guide assumes that you chose Java.
    
    3.Click Dependencies and select Spring Web, Spring Data JPA, and MySQL Driver.
    
    4.Click Generate.