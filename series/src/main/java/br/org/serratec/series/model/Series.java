package br.org.serratec.series.model;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.org.serratec.series.dto.NovaSeriesDTO;
import br.org.serratec.series.exception.MensagensValidator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = MensagensValidator.NOT_BLANK)
    @Size(max = 255, message = MensagensValidator.INVALID_MAX_SIZE)
    private String nome;

    @NotBlank(message = MensagensValidator.NOT_BLANK)
    @Size(max = 255, message = MensagensValidator.INVALID_MAX_SIZE)
    private String genero;

    private int temporadas;

    @Size(max = 1000, message = MensagensValidator.INVALID_MAX_SIZE)
    private String resumo;

    private String foto;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dataCriacao;

    public Series() {
        // Construtor padrão
    }

    public Series(NovaSeriesDTO novaSeriesDTO) {
        this.nome = novaSeriesDTO.getNome();
        this.genero = novaSeriesDTO.getGenero();
        this.temporadas = novaSeriesDTO.getTemporadas();
        this.resumo = novaSeriesDTO.getResumo();
        this.foto = novaSeriesDTO.getFoto();
    }

    public Series(Long id, String nome, String genero, int temporadas, String resumo, String foto, LocalDate dataCriacao) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(id, series.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
