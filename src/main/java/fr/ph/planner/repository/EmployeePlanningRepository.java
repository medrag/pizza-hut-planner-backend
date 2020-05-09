package fr.ph.planner.repository;

import fr.ph.planner.model.EmployeePlanning;
import fr.ph.planner.model.EmployeePlanningKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeePlanningRepository extends JpaRepository<EmployeePlanning, EmployeePlanningKey> {

    List<EmployeePlanning> findAllByPlanningSemaine(String semaine);
}
