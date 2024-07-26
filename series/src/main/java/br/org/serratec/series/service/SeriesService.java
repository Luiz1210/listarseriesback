package br.org.serratec.series.service;

import java.util.List;
import java.util.stream.Collectors;

import br.org.serratec.series.dto.SeriesDTO;
import br.org.serratec.series.dto.NovaSeriesDTO;
import br.org.serratec.series.model.Series;
import br.org.serratec.series.repository.SeriesRepository;
import org.springframework.stereotype.Service;

@Service
public class SeriesService {

    private final SeriesRepository seriesRepository;

    public SeriesService(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    public List<SeriesDTO> findAll() {
        return seriesRepository.findAll().stream()
                .map(series -> new SeriesDTO(series.getId(), series.getNome(), series.getGenero(), series.getTemporadas(), series.getResumo(), series.getFoto(), series.getDataCriacao()))
                .collect(Collectors.toList());
    }

    public SeriesDTO findById(Long id) {
        Series series = seriesRepository.findById(id).orElseThrow(() -> new RuntimeException("Series not found"));
        return new SeriesDTO(series.getId(), series.getNome(), series.getGenero(), series.getTemporadas(), series.getResumo(), series.getFoto(), series.getDataCriacao());
    }

    public SeriesDTO create(NovaSeriesDTO novaSeriesDTO) {
        // Cria a entidade Series a partir do DTO
        Series series = new Series();
        series.setNome(novaSeriesDTO.getNome());
        series.setGenero(novaSeriesDTO.getGenero());
        series.setTemporadas(novaSeriesDTO.getTemporadas());
        series.setResumo(novaSeriesDTO.getResumo());
        series.setFoto(novaSeriesDTO.getFoto());
        
        // Salva a nova série e converte para DTO
        Series savedSeries = seriesRepository.save(series);
        return new SeriesDTO(savedSeries.getId(), savedSeries.getNome(), savedSeries.getGenero(), savedSeries.getTemporadas(), savedSeries.getResumo(), savedSeries.getFoto(), savedSeries.getDataCriacao());
    }
}
