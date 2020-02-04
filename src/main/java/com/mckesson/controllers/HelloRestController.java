package com.mckesson.controllers;

import com.mckesson.entities.Person;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @GetMapping
    public Person getPerson(@RequestParam (defaultValue="Anand") String name, @RequestParam Date birthDate, @RequestParam String email, @RequestParam String address ){
       Person person = new Person(name, birthDate, email, address);
       return person;
    }
    @PostMapping
    public Person putPerson(@RequestBody Person person ){
        return person;
    }
}
