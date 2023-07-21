package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
public class RecuperarAgenteResponse {


    private static final long serialVersionUID = 1L;

    @JsonProperty("dataHeader")
    private DataHeaderResponseTypeDto dataHeader;

    @JsonProperty("data")
    private AgentOutTypeDto data;
}
