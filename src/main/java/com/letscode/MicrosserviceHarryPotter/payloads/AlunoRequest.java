package com.letscode.MicrosserviceHarryPotter.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AlunoRequest {
    private String nome;
    private String serie;
}
