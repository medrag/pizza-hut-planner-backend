package fr.ph.planner.repository;

import fr.ph.planner.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    void deleteAllByMagasinId(Long magasinId);
    List<Employee> getAllByMagasinId(Long magasinId);
}
