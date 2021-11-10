package com.example.heroku;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private RepositoryGreetings repositoryGreetings;

    @GetMapping("/")
    String hello(){
        return "Hello world123";
    }

    @GetMapping("greetings")
    List<Greeting> greetings(){
        return repositoryGreetings.findAll();
    }
}
