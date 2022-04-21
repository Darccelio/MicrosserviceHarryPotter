package com.letscode.MicrosserviceHarryPotter.service;

import com.letscode.MicrosserviceHarryPotter.clients.GetChaveSeletora;
import com.letscode.MicrosserviceHarryPotter.entities.Aluno;
import com.letscode.MicrosserviceHarryPotter.payloads.AlunoRequest;
import com.letscode.MicrosserviceHarryPotter.payloads.AlunoResponse;
import com.letscode.MicrosserviceHarryPotter.payloads.clients.Chave;
import com.letscode.MicrosserviceHarryPotter.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateStudenteService {

    @Autowired
    GetChaveSeletora getChaveSeletora;

    @Autowired
    AlunoRepository alunoRepository;

    public AlunoResponse execute(AlunoRequest alunoRequest) {

        Aluno aluno = new Aluno();
        aluno.setNome(alunoRequest.getNome());
        aluno.setSerie(alunoRequest.getSerie());

        Chave chave = getChaveSeletora.execute();
        aluno.setChaveCasa(chave.getSorteioChave());

        System.out.println("chave" + aluno.getChaveCasa());

        Aluno alunoSalvo = alunoRepository.save(aluno);
        return alunoSalvo.toResponse(alunoSalvo);
    }
}
