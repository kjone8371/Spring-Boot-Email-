# Spring Boot React Login Service
![Spring_Login](https://github.com/kjone8371/Spring-Boot-Email-/assets/103641429/6f6fe662-c102-4e31-8c9e-3105791494e1)


# Setting up the Backend Server(Server-Option)

+ Build.Gradle
```build
    implementation 'org.springframework.boot:spring-boot-starter-mail'
```

+ application.properties
```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=자기 이메일
spring.mail.password=앱 비밀번호
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.timeout=50000
spring.mail.properties.mail.smtp.connectiontimeout=50000
spring.mail.properties.mail.smtp.starttls.enable=true
```
# 


