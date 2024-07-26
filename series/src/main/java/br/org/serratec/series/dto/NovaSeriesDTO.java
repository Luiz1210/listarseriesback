package br.org.serratec.series.dto;

public class NovaSeriesDTO {
    private String nome;
    private String genero;
    private int temporadas;
    private String resumo;
    private String foto;

    // Construtores
    public NovaSeriesDTO() {}

    public NovaSeriesDTO(String nome, String genero, int temporadas, String resumo, String foto) {
        this.nome = nome;
        this.genero = genero;
        this.temporadas = temporadas;
        this.resumo = resumo;
        this.foto = foto;
    }

    // Getters e Setters
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
}
