package fr.ph.planner.service;

import fr.ph.planner.model.Jour;
import fr.ph.planner.model.Periode;
import fr.ph.planner.model.Planning;
import fr.ph.planner.model.PlanningPostWrapper;
import fr.ph.planner.repository.JourRepository;
import fr.ph.planner.repository.PeriodeRepository;
import fr.ph.planner.repository.PlanningRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class PlanningService {

    @Autowired
    private PlanningRepository planningRepository;
    @Autowired
    private JourRepository jourRepository;
    @Autowired
    private PeriodeRepository periodeRepository;

    public List<Planning> getAllPlannings() {
        return this.planningRepository.findAll();
    }

    public PlanningPostWrapper saveEmployeePlanning(PlanningPostWrapper planningPostWrapper) {

        Planning savedPlanning = this.planningRepository.save(planningPostWrapper.getPlanning());
        List<Jour> savedJours = this.jourRepository.saveAll(this.setJourPlanning(planningPostWrapper.getJours(), savedPlanning));
        List<Periode> savedPeriodes = this.periodeRepository.saveAll(this.setPeriodeJour(planningPostWrapper.getPeriodes(), savedJours));

        planningPostWrapper.setPlanning(savedPlanning);
        planningPostWrapper.setJours(savedJours);
        planningPostWrapper.setPeriodes(savedPeriodes);

        return planningPostWrapper;
    }

    private List<Jour> setJourPlanning(List<Jour> jours, Planning savedPlanning) {
        for(Jour jour : jours) {
            jour.setPlanning(savedPlanning);
        }
        return jours;
    }

    private List<Periode> setPeriodeJour(List<Periode> periodes, List<Jour> savedJours) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Periode periode: periodes) {
            for (Jour jour: savedJours) {
                if (sdf.format(periode.getJour().getDate()).equals(sdf.format(jour.getDate()))) {
                    periode.setJour(jour);
                }
            }
        }
        return periodes;
    }
}
