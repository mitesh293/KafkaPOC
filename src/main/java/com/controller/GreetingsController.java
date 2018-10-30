package com.controller;

import com.model.Greetings;
import com.service.GreetingsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingsController {
    private final GreetingsService greetingsService;
    public GreetingsController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("message") String message,@RequestParam("age") int age,@RequestParam("firstname") String firstName,@RequestParam("lastname") String lastName) {
        log.debug("in side greetings response ");
        Greetings greetings = Greetings.builder()
                .message(message)
                .timestamp(System.currentTimeMillis())
                .age(age).firstName(firstName).lastName(lastName)
                .build();
        greetingsService.sendGreeting(greetings);
    }
}
