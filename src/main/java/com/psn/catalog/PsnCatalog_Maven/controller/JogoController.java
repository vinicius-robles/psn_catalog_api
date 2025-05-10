package com.psn.catalog.PsnCatalog_Maven.controller;


import com.psn.catalog.PsnCatalog_Maven.model.Jogo;
import com.psn.catalog.PsnCatalog_Maven.repository.JogoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/jogos")
public class JogoController {

    private final JogoRepository jogoRepository;

    public JogoController(JogoRepository jogoRepository) {
        this.jogoRepository = jogoRepository;
    }

    // GET /api/jogos - Lista todos os jogos
    @GetMapping
    public List<Jogo> listarTodos() {
        return jogoRepository.findAll();
    }

    // GET /api/jogos/recentes - Jogos recentes (últimos 2 anos)
    @GetMapping("/recentes")
    public List<Jogo> listarRecentes() {
        LocalDate doisAnosAtras = LocalDate.now().minusYears(2);
        return jogoRepository.findJogosRecentes(doisAnosAtras);
    }

    // GET /api/jogos/por-preco?maximo=300 - Jogos até certo preço
    @GetMapping("/por-preco")
    public List<Jogo> listarPorPrecoMaximo(@RequestParam Double maximo) {
        return jogoRepository.findJogosComPrecoAte(maximo);
    }

    // GET /api/jogos/busca?titulo=spider - Busca por título
    @GetMapping("/busca")
    public List<Jogo> buscarPorTitulo(@RequestParam String titulo) {
        return jogoRepository.findByTituloContainingIgnoreCase(titulo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogo> buscarPorId(@PathVariable Long id) {
        return jogoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Jogo> criarJogo(@RequestBody Jogo jogo) {
        Jogo jogoSalvo = jogoRepository.save(jogo);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(jogoSalvo.getId())
                .toUri();

        return ResponseEntity.created(location).body(jogoSalvo);
    }

    // DELETE /api/jogos/{id} - Remove jogo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerJogo(@PathVariable Long id) {
        if (!jogoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        jogoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
