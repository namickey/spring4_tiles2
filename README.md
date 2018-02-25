# spring4_tiles2

## Dependencies
* org.springframework:spring-webmvc:4.3.12.RELEASE
* org.hibernate:hibernate-validator:5.3.5.Final
* org.apache.tiles:tiles-jsp:2.2.2
* org.slf4j:slf4j-nop:1.5.8
* javax.servlet:jstl:1.2
* org.projectlombok:lombok:1.16.18
* javax.servlet:servlet-api:2.4

## Tree
```
├── README.md
├── build.gradle
└── src
    └── main
        ├── java
        │   └── demo
        │       ├── controller
        │       │   ├── hello
        │       │   │   └── GreetController.java
        │       │   └── shop
        │       │       ├── RegistShopController.java
        │       │       └── RegistShopForm.java
        │       └── resolver
        │           └── UserAgentViewResolver.java
        ├── resources
        │   ├── META-INF
        │   │   ├── messages
        │   │   │   ├── messages.properties
        │   │   │   └── messages_ja.properties
        │   │   ├── spring
        │   │   │   ├── applicationContext-beans.xml
        │   │   │   └── applicationContext-webmvc.xml
        │   │   └── tiles
        │   │       └── tiles.xml
        │   └── static
        │       └── img
        │           └── dog-puppy.jpeg
        └── webapp
            ├── WEB-INF
            │   ├── views
            │   │   ├── common
            │   │   │   ├── layout.jsp
            │   │   │   └── top.jsp
            │   │   ├── hello
            │   │   │   └── greet.jsp
            │   │   └── shop
            │   │       └── regist.jsp
            │   └── web.xml
            └── index.jsp
```

## Install gradle
https://gradle.org/

## Execute
$ gradle tomcatRun
http://localhost:8080/demo

## Proxy
Accessing the web through a HTTP proxy.
```C:/Users/<username>/.gradle/gradle.properties
systemProp.http.proxyHost=proxyhost
systemProp.http.proxyPort=8080
systemProp.https.proxyHost=proxyhost
systemProp.https.proxyPort=8080
```
