package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/api/v1/terceros/agentes/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getAgente(@PathVariable("codigo") String codigo){
        return "hola agente "+codigo;
    }
}
