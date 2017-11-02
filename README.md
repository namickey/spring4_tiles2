# spring4_tiles2

## Summary
* sprintframework-webmvc:4.3.12.RELEASE  
* apache-tiles:2.2.2  
* hibernate-validator:5.3.5.Final  
* jsp  
* jstl:1.2  
* servlet-api:2.5  
* lombok:1.16.18  
* gradle:3.2.1  

## Tree

```
├── README.md
├── build.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── demo
    │   │       ├── controller
    │   │       │   ├── Hello.java
    │   │       │   └── shop
    │   │       │       ├── RegistShopController.java
    │   │       │       └── RegistShopForm.java
    │   │       └── service
    │   │           ├── ShopService.java
    │   │           └── ShopServiceImpl.java
    │   ├── resources
    │   │   ├── META-INF
    │   │   │   └── messages
    │   │   │       ├── messages.properties
    │   │   │       └── messages_ja.properties
    │   │   ├── spring
    │   │   │   ├── applicationContext-beans.xml
    │   │   │   └── applicationContext-webmvc.xml
    │   │   └── static
    │   │       └── img
    │   │           └── dog-puppy.jpeg
    │   └── webapp
    │       └── WEB-INF
    │           ├── views
    │           │   ├── common
    │           │   │   ├── layout.jsp
    │           │   │   └── top.jsp
    │           │   ├── greet.jsp
    │           │   ├── index.jsp
    │           │   ├── regist.jsp
    │           │   └── tiles.xml
    │           └── web.xml
```

## Execute
$ gradle tomcatRun

http://localhost:8080/demo


