package com.pairprogramming.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("{number}")
    public float returnValue(@PathVariable("number") float number){
        return number;
    }

    @GetMapping
    public float returnValue(){
        return Controller.randomlyGeneratedNumber();
    }

    private static float randomlyGeneratedNumber(){
        return (float) Math.random();
    }
}
