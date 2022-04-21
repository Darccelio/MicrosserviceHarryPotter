package com.letscode.MicrosserviceHarryPotter.clients;

import com.letscode.MicrosserviceHarryPotter.payloads.clients.CasaHarryPotter;
import com.letscode.MicrosserviceHarryPotter.payloads.clients.Chave;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetChaveSeletora {

    @Value("${client.chave.validator}")
    private String urlGetChave;

    public Chave execute() {
        RestTemplate restTamplate = new RestTemplate();
        ResponseEntity<Chave> chave = restTamplate.getForEntity(urlGetChave, Chave.class);
        return chave.getBody();
    }

}

//
//    HttpHeaders headers = new HttpHeaders();
//        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
//                HttpEntity<?> entity = new HttpEntity<>(headers);