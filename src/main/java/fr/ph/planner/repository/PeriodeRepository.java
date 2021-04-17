package fr.ph.planner.repository;

import fr.ph.planner.model.Periode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodeRepository extends JpaRepository<Periode, Long> {
}
