package br.org.serratec.series.controller;

import java.net.URI;
import java.util.List;

import br.org.serratec.series.dto.SeriesDTO;
import br.org.serratec.series.dto.NovaSeriesDTO;
import br.org.serratec.series.service.SeriesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/series")
public class SeriesController {

    private final SeriesService seriesService;

    public SeriesController(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    @GetMapping
    public List<SeriesDTO> findAll() {
        return seriesService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SeriesDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(seriesService.findById(id));
    }

    @PostMapping
    public ResponseEntity<SeriesDTO> create(@RequestBody NovaSeriesDTO novaSeriesDTO) {
        SeriesDTO savedSeries = seriesService.create(novaSeriesDTO);
        URI uri = URI.create("/series/" + savedSeries.getId());
        return ResponseEntity.created(uri).body(savedSeries);
    }
}
