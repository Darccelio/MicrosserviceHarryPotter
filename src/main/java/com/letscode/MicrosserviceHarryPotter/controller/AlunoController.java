package com.letscode.MicrosserviceHarryPotter.controller;


import com.letscode.MicrosserviceHarryPotter.payloads.AlunoRequest;
import com.letscode.MicrosserviceHarryPotter.payloads.AlunoResponse;
import com.letscode.MicrosserviceHarryPotter.service.CreateStudenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
public class AlunoController {

    private final CreateStudenteService createStudent;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.CREATED)
    public AlunoResponse createStudent(@RequestBody AlunoRequest alunoRequest) {
        return createStudent.execute(alunoRequest);
    }

//    @GetMapping("/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public AlunoResponse getStudentAndClass(@RequestParam)
//

}
