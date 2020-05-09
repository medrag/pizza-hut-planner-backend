package fr.ph.planner.service;

import fr.ph.planner.model.EmployeePlanning;
import fr.ph.planner.repository.EmployeePlanningRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeePlanningService {

    @Autowired
    private EmployeePlanningRepository employeePlanningRepository;

    public List<EmployeePlanning> getEmployeesPlanning() {
        return this.employeePlanningRepository.findAll();
    }
}
