package com.psn.catalog.PsnCatalog_Maven;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		servers = @Server(url = "/", description = "Default Server URL"),
		info = @Info(
		title = "PSN Catalog API",
		version = "1.0",
		description = "Catálogo de jogos PlayStation"
))

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
