package com.letscode.MicrosserviceHarryPotter.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.letscode.MicrosserviceHarryPotter.payloads.clients.CasaResponse;
import lombok.Data;

@Data
public class AlunoResponse {
    @JsonProperty("aluno-id")
    private Integer id;
    private String nome;
    private String serie;
    private CasaResponse casaResponse;

}
