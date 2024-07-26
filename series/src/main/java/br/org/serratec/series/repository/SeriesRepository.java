package br.org.serratec.series.repository;

import br.org.serratec.series.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Long> {
}
