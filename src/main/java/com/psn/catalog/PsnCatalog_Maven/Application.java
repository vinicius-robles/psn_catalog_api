package com.psn.catalog.PsnCatalog_Maven;

import com.psn.catalog.PsnCatalog_Maven.model.Jogo;
import com.psn.catalog.PsnCatalog_Maven.repository.JogoRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "PSN Catalog API",
		version = "1.0",
		description = "Catálogo de jogos PlayStation"
))
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
