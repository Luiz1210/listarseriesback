package br.org.serratec.series.dto;

import java.time.LocalDate;

public class SeriesDTO {

    private Long id;
    private String nome;
    private String genero;
    private int temporadas;
    private String resumo;
    private String foto;
    private LocalDate dataCriacao;

    // Construtores
    public SeriesDTO() {}

    public SeriesDTO(Long id, String nome, String genero, int temporadas, String resumo, String foto, LocalDate dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.temporadas = temporadas;
        this.resumo = resumo;
        this.foto = foto;
        this.dataCriacao = dataCriacao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
