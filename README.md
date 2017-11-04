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
    │   │       │   ├── Index.java
    │   │       │   ├── hello
    │   │       │   │   └── GreetController.java
    │   │       │   └── shop
    │   │       │       ├── RegistShopController.java
    │   │       │       └── RegistShopForm.java
    │   │       └── service
    │   │           └── shop
    │   │               ├── ShopService.java
    │   │               └── ShopServiceImpl.java
    │   ├── resources
    │   │   ├── META-INF
    │   │   │   ├── messages
    │   │   │   │   ├── messages.properties
    │   │   │   │   └── messages_ja.properties
    │   │   │   ├── spring
    │   │   │   │   ├── applicationContext-beans.xml
    │   │   │   │   └── applicationContext-webmvc.xml
    │   │   │   └── tiles
    │   │   │       └── tiles.xml
    │   │   └── static
    │   │       └── img
    │   │           └── dog-puppy.jpeg
    │   └── webapp
    │       └── WEB-INF
    │           ├── views
    │           │   ├── common
    │           │   │   ├── layout.jsp
    │           │   │   └── top.jsp
    │           │   ├── hello
    │           │   │   └── greet.jsp
    │           │   ├── index.jsp
    │           │   └── shop
    │           │       └── regist.jsp
    │           └── web.xml
```

## Execute
$ gradle tomcatRun

http://localhost:8080/demo


