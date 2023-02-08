package spring.framework.msscbreweryservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.framework.msscbreweryservice.web.model.CoffeeDto;

import java.util.UUID;

@RestController("/api/v1/coffee")
@RequestMapping

public class CoffeeController {

    @GetMapping
    public ResponseEntity<CoffeeDto> getCoffeeById(@PathVariable("coffeeId") UUID coffeeId){
        //todo impl

        return new ResponseEntity<>(CoffeeDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewCoffee(@RequestBody CoffeeDto coffeeDto){

        //todo impl

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("{coffeeId}")
    public ResponseEntity updateCoffeeById(@PathVariable("coffeeId") UUID coffeeId, @RequestBody CoffeeDto coffeeDto){

        //todo impl

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
