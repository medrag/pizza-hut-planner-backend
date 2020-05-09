package fr.ph.planner.service;

import fr.ph.planner.model.Planning;
import fr.ph.planner.repository.PlanningRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PlanningService {

    @Autowired
    private PlanningRepository planningRepository;

    public List<Planning> getAllPlannings() {
        return this.planningRepository.findAll();
    }
}
