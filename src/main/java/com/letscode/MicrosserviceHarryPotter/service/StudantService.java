package com.letscode.MicrosserviceHarryPotter.service;

import com.letscode.MicrosserviceHarryPotter.clients.GetInfoCasa;
import com.letscode.MicrosserviceHarryPotter.entities.Aluno;
import com.letscode.MicrosserviceHarryPotter.payloads.AlunoRequest;
import com.letscode.MicrosserviceHarryPotter.payloads.AlunoResponse;
import com.letscode.MicrosserviceHarryPotter.payloads.CasaResponse;
import com.letscode.MicrosserviceHarryPotter.payloads.clients.Chave;
import com.letscode.MicrosserviceHarryPotter.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudantService {

    @Autowired
    GetInfoCasa getInfoCasa;

    @Autowired
    AlunoRepository alunoRepository;

    public AlunoResponse createStudant(AlunoRequest alunoRequest) {

        Aluno aluno = new Aluno();
        aluno.setNome(alunoRequest.getNome());
        aluno.setSerie(alunoRequest.getSerie());
        Chave chave = getInfoCasa.getChave();
        aluno.setChaveCasa(chave.getSorteioChave());
        Aluno alunoSalvo = alunoRepository.save(aluno);
        return alunoSalvo.toResponse(alunoSalvo);
    }

    public AlunoResponse getAlunoECasa(Integer id) {
        Aluno aluno = alunoRepository.getById(id);
        CasaResponse casaResponse = getInfoCasa.getCasa(aluno.getChaveCasa());
        AlunoResponse alunoResponse = new AlunoResponse();
        alunoResponse.setId(aluno.getId());
        alunoResponse.setNome(aluno.getNome());
        alunoResponse.setSerie(aluno.getSerie());
        alunoResponse.setCasaResponse(casaResponse);
        return alunoResponse;
    }
}
