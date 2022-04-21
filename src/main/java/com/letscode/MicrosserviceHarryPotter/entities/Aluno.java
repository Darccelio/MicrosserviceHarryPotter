package com.letscode.MicrosserviceHarryPotter.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.letscode.MicrosserviceHarryPotter.payloads.AlunoResponse;
import com.letscode.MicrosserviceHarryPotter.payloads.clients.Chave;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "aluno_tb")
@Data
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="nome")
    private String nome;

    @Column(name = "serie")
    private String serie;

    @Column(name = "chave_casa_seletora")
    private String chaveCasa;

    public AlunoResponse toResponse(Aluno aluno) {
        AlunoResponse alunoResponse = new AlunoResponse();
        alunoResponse.setNome(aluno.getNome());
        alunoResponse.setSerie(aluno.getSerie());
        alunoResponse.setChave(aluno.chaveCasa);
        alunoResponse.setId(aluno.getId());
        return alunoResponse;
    }
}