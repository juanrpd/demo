package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgentOutTypeDto {
    /**
     * versión serial UID
     */
    private static final long serialVersionUID = 1L;

    @JsonProperty("codAgente")
    private String agentCode;

    @JsonProperty("agencia")
    private String agency;

    @JsonProperty("tipoMercadeo")
    private String marketingType;

    @JsonProperty("formaActuacion")
    private String formActuation;

    @JsonProperty("numeroDocumento")
    private String documentNumber;

    @JsonProperty("tipoDocumento")
    private String documentType;

    @JsonProperty("secuencia")
    private String sequence;

    @JsonProperty("estadoAgente")
    private String agentStatus;

    @JsonProperty("codConvenio")
    private String agreementCode;

    @JsonProperty("nombres")
    private String names;

    @JsonProperty("primerNombre")
    private String firstName;

    @JsonProperty("segundoNombre")
    private String secondName;

    @JsonProperty("primerApellido")
    private String firstSurname;

    @JsonProperty("segundoApellido")
    private String secondSurname;

}
