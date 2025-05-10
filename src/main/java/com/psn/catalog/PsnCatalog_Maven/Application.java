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

//	@Bean
//	public CommandLineRunner demo(JogoRepository jogoRepository) {
//		return (args) -> {
//			// Limpa e popula o banco de dados inicial
//			jogoRepository.deleteAll();
//
//			// Cria alguns jogos de exemplo
//			Jogo jogo1 = new Jogo("God of War Ragnarök", "Santa Monica Studio",
//					LocalDate.of(2022, 11, 9), 299.90);
//
//			Jogo jogo2 = new Jogo("Horizon Forbidden West", "Guerrilla Games",
//					LocalDate.of(2022, 2, 18), 249.90);
//
//			Jogo jogo3 = new Jogo("Marvel's Spider-Man 2", "Insomniac Games",
//					LocalDate.of(2023, 10, 20), 349.90);
//
//			Jogo jogo4 = new Jogo("The Last of Us Part I", "Naughty Dog",
//					LocalDate.of(2022, 9, 2), 249.90);
//
//			// Salva no banco de dados
//			jogoRepository.saveAll(List.of(jogo1, jogo2, jogo3, jogo4));
//
//			// Testa as consultas
//			System.out.println("\n=== TODOS OS JOGOS ===");
//			jogoRepository.findAll().forEach(System.out::println);
//
//			System.out.println("\n=== JOGOS RECENTES (últimos 2 anos) ===");
//			LocalDate doisAnosAtras = LocalDate.now().minusYears(2);
//			jogoRepository.findJogosRecentes(doisAnosAtras).forEach(System.out::println);
//
//			System.out.println("\n=== JOGOS ATÉ R$ 300 ===");
//			jogoRepository.findJogosComPrecoAte(300.0).forEach(System.out::println);
//
//			System.out.println("\n=== BUSCA POR 'Spider' ===");
//			jogoRepository.findByTituloContainingIgnoreCase("Spider").forEach(System.out::println);
//		};
//	}
}
