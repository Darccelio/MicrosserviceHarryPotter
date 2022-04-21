package com.letscode.MicrosserviceHarryPotter;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Microsservico Harry Potter", version = "1.0", description = "Cadastro de alunos da escola de mágia de Harry Potter."))
public class MicrosserviceHarryPotterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosserviceHarryPotterApplication.class, args);
	}

}
