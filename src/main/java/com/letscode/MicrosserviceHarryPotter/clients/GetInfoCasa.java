package com.letscode.MicrosserviceHarryPotter.clients;

import com.letscode.MicrosserviceHarryPotter.payloads.clients.CasaResponse;
import com.letscode.MicrosserviceHarryPotter.payloads.clients.Chave;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetInfoCasa {

    @Value("${cliente.chave.validator}")
    private String urlGetChave;

    @Value("${cliente.casa.validator}")
    private String urlGetCasa;

    public Chave getChave() {
        RestTemplate restTamplate = new RestTemplate();
        ResponseEntity<Chave> chave = restTamplate.getForEntity(urlGetChave, Chave.class);
        return chave.getBody();
    }

    public CasaResponse getCasa(String chave) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<CasaResponse> casaResponseEntity =
                restTemplate.exchange(urlGetCasa, HttpMethod.GET, entity, CasaResponse.class, chave);
        if (casaResponseEntity.getStatusCode().isError()) {
            // TODO lançar erro proprio
            return null;
        }

        System.out.println(casaResponseEntity.getBody());

        return casaResponseEntity.getBody();
    }



}

