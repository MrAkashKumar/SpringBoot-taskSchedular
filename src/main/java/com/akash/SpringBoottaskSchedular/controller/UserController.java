package com.akash.SpringBoottaskSchedular.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "")
    public ResponseEntity<Object> getData(){
        return null;
    }

}
