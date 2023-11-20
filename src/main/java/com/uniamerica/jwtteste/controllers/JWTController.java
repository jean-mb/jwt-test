package com.uniamerica.jwtteste.controllers;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class JWTController {
    @GetMapping
    public String main(){
        return "Passou";
    }
}
