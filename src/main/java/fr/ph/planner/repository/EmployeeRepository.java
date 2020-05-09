package fr.ph.planner.repository;

import fr.ph.planner.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    void deleteAllByMagasinId(Long magasinId);
}
