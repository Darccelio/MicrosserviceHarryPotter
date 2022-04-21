package com.letscode.MicrosserviceHarryPotter.controller;


import com.letscode.MicrosserviceHarryPotter.payloads.AlunoRequest;
import com.letscode.MicrosserviceHarryPotter.payloads.AlunoResponse;
import com.letscode.MicrosserviceHarryPotter.service.StudantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
public class AlunoController {

    private final StudantService studentService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<AlunoResponse> createStudent(@RequestBody AlunoRequest alunoRequest) {
        AlunoResponse alunoResponse = studentService.createStudant(alunoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AlunoResponse getStudentAndClass(@RequestParam(required = false) Integer id) {
        return studentService.getAlunoECasa(id);
    }




}
