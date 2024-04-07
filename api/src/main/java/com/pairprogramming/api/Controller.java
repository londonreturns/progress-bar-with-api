package com.pairprogramming.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("{number}")
    public ResponseEntity<Value> returnValue(@PathVariable("number") int number){
        Value value = new Value();
        value.value = number;
        return new ResponseEntity<>(value, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Value> returnValue() {
        List<Value> values = new ArrayList<>();

        // Create and add the first value
        Value value1 = new Value();
        value1.value = (randomlyGeneratedNumber());
        values.add(value1);

        // Create and add the second value
        Value value2 = new Value();
        value2.value = (randomlyGeneratedNumber());
        values.add(value2);

        return values;
    }

    private static int randomlyGeneratedNumber(){
        return (int) ( 100 *  Math.random());
    }
}
