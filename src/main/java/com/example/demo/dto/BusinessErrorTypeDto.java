package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class BusinessErrorTypeDto {
    /**
     * versión serial UID
     */
    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("descripcion")
    private String descripcion;

    @JsonProperty("msgErrorOrcl")
    private String msgErrorOrcl;

    @JsonProperty("msgErrorOrcl1")
    private String msgErrorOrcl1;
}
