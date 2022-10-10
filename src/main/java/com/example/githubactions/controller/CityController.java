package com.example.githubactions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @GetMapping("/city/{id}")
    public ResponseEntity getCityById(@PathVariable Integer id){
        return ResponseEntity.ok("ID: " + id + " is THIS city");
    }
}
