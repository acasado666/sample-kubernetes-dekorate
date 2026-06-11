package com.kodebytes.acasado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringApplication.class, args);
    }

    @RestController
    public class DekorateController {

        @GetMapping("/hello")
        public ResponseEntity<String> getHello() {
            return ResponseEntity.ok("Hello, from Kubernetes!");
        }

        @GetMapping("/")
        String home() {
            return "Spring Boot + Dekorate + Skaffold is running";
        }
    }

}
