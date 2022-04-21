package com.letscode.MicrosserviceHarryPotter.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.letscode.MicrosserviceHarryPotter.entities.Aluno;
import lombok.Data;

@Data
public class AlunoResponse extends AlunoRequest{

    @JsonProperty("aluno-id")
    private String id;

    private String chave;

//    public static AlunoResponse toResponse(Aluno aluno) {
//        AlunoResponse alunoResponse = new AlunoResponse();
//        alunoResponse.setNome(aluno.getNome());
//        alunoResponse.setSerie(aluno.getSerie());
//        alunoResponse.set
//        return alunoResponse;
//    }

}
