package com.example.heroku;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HerokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(HerokuApplication.class, args);
    }


    @Bean
    ApplicationRunner applicationRunner(RepositoryGreetings repositoryGreetings){
        return args -> {
            repositoryGreetings.save(new Greeting("Hello"));
            repositoryGreetings.save(new Greeting("Hi"));
            repositoryGreetings.save(new Greeting("Czesc"));
            repositoryGreetings.save(new Greeting("Hay"));
        };
    }

}
