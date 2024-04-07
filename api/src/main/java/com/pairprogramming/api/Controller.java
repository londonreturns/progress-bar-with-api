package com.pairprogramming.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("{number}")
    public int returnValue(@PathVariable("number") int number){
        return number;
    }

    @GetMapping
    public int returnValue(){
        return Controller.randomlyGeneratedNumber();
    }

    private static int randomlyGeneratedNumber(){
        return (int) ( 100 *  Math.random());
    }
}
