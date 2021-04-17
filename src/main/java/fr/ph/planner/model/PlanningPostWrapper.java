package fr.ph.planner.model;

import lombok.Data;

import java.util.List;

@Data
public class PlanningPostWrapper {
    private Planning planning;
    private List<Jour> jours;
    private List<Periode> periodes;
}
