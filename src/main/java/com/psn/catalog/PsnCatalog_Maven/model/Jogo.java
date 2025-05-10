package com.psn.catalog.PsnCatalog_Maven.model;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String desenvolvedora;

    @Column(nullable = false)
    private LocalDate dataLancamento;

    @Column(nullable = false)
    private Double preco;

    public Jogo() {
    }

    public Jogo(String titulo, String desenvolvedora, LocalDate dataLancamento, Double preco) {
        this.titulo = titulo;
        this.desenvolvedora = desenvolvedora;
        this.dataLancamento = dataLancamento;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", desenvolvedora='" + desenvolvedora + '\'' +
                ", dataLancamento=" + dataLancamento +
                ", preco=" + preco +
                '}';
    }
}

