package com.edson.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.edson.app.commons.usuarios.models.entities"})
@SpringBootApplication
public class ServicoUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoUsuariosApplication.class, args);
	}

}
