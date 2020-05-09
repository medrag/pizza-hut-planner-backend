package fr.ph.planner.controller;

import fr.ph.planner.model.EmployeePlanning;
import fr.ph.planner.model.Planning;
import fr.ph.planner.service.EmployeePlanningService;
import fr.ph.planner.service.PlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/plannings")
public class PlanningController {

    @Autowired
    private PlanningService planningService;
    @Autowired
    private EmployeePlanningService employeePlanningService;

    @GetMapping
    public ResponseEntity<List<Planning>> getAllPlanning() {
        return ResponseEntity.ok(this.planningService.getAllPlannings());
    }

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeePlanning>> getEmployeesPlanning() {
        return ResponseEntity.ok(this.employeePlanningService.getEmployeesPlanning());
    }
}
