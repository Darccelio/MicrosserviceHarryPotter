package com.letscode.MicrosserviceHarryPotter.payloads;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AlunoRequest {
    private String nome;
    private String serie;
}
