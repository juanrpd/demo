package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataHeaderResponseTypeDto {
    /**
     * versión serial UID
     */
    private static final long serialVersionUID = 1L;

    @JsonProperty("codRespuesta")
    private Integer responseCode;

    @JsonProperty("errores")
    private List<BusinessErrorTypeDto> errors;
}
