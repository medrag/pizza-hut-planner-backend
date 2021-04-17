package fr.ph.planner.controller;

import fr.ph.planner.model.PlanningPostWrapper;
import fr.ph.planner.service.PlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plannings")
public class PlanningController {

    @Autowired
    private PlanningService planningService;

    @PostMapping("/save")
    public ResponseEntity<PlanningPostWrapper> saveEmployeePlanning(@RequestBody PlanningPostWrapper planningPostWrapper) {
        return ResponseEntity.ok(this.planningService.saveEmployeePlanning(planningPostWrapper));
    }
}
