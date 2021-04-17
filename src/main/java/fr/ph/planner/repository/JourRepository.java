package fr.ph.planner.repository;

import fr.ph.planner.model.Jour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JourRepository extends JpaRepository<Jour, Long> {
}
