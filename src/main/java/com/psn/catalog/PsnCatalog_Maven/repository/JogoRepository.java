package com.psn.catalog.PsnCatalog_Maven.repository;


import com.psn.catalog.PsnCatalog_Maven.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface JogoRepository extends JpaRepository<Jogo, Long> {


    List<Jogo> findByTituloContainingIgnoreCase(String titulo);
    List<Jogo> findByDesenvolvedora(String desenvolvedora);


    @Query("SELECT j FROM Jogo j WHERE j.dataLancamento >= :dataLimite ORDER BY j.dataLancamento DESC")
    List<Jogo> findJogosRecentes(@Param("dataLimite") LocalDate dataLimite);


    @Query("SELECT j FROM Jogo j WHERE j.preco <= :precoMaximo ORDER BY j.preco ASC")
    List<Jogo> findJogosComPrecoAte(@Param("precoMaximo") Double precoMaximo);
}
