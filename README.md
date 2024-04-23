# Spring Boot Email Service
스프링 

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

