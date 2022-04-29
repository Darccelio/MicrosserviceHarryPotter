package com.letscode.MicrosserviceHarryPotter.payloads.clients;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Data
public class CasaResponse {
    private String id;
    private String name;
    private String animal;
    private String founder;
    private List<Value> values;
}
