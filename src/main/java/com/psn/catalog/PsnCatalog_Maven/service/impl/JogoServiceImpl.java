package com.psn.catalog.PsnCatalog_Maven.service.impl;

import com.psn.catalog.PsnCatalog_Maven.model.Jogo;
import com.psn.catalog.PsnCatalog_Maven.repository.JogoRepository;
import com.psn.catalog.PsnCatalog_Maven.service.JogoService;

import java.time.LocalDate;
import java.util.List;

public class JogoServiceImpl implements JogoService {

    private final JogoRepository jogoRepository;

    public JogoServiceImpl(JogoRepository jogoRepository) {
        this.jogoRepository = jogoRepository;
    }

    public List<Jogo> buscarJogosRecentes() {
        LocalDate umAnoAtras = LocalDate.now().minusYears(1);
        return jogoRepository.findJogosRecentes(umAnoAtras);
    }

    public List<Jogo> buscarJogosBaratos() {
        return jogoRepository.findJogosComPrecoAte(100.0);
    }

    public List<Jogo> buscarPorTitulo(String titulo) {
        return jogoRepository.findByTituloContainingIgnoreCase(titulo);
    }
}
