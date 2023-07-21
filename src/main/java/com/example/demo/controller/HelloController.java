package com.example.demo.controller;

import com.example.demo.dto.AgentOutTypeDto;
import com.example.demo.dto.DataHeaderResponseTypeDto;
import com.example.demo.dto.RecuperarAgenteResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/api/v1/terceros/agentes/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public RecuperarAgenteResponse getAgente(@PathVariable("codigo") String codigo){
        return RecuperarAgenteResponse.builder()
                .dataHeader(DataHeaderResponseTypeDto.builder().responseCode(0).build())
                .data(AgentOutTypeDto.builder()
                        .agency("123")
                        .agentCode("007")
                        .agentStatus("ok")
                        .agreementCode("test")
                        .documentNumber("123456")
                        .documentType("CC")
                        .firstName("Juan")
                        .firstSurname("Puello")
                        .formActuation("AC")
                        .marketingType(null)
                        .names("Juan Puello")
                        .secondName(null)
                        .build())
                .build();

    }
}
