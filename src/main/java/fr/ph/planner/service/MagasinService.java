package fr.ph.planner.service;

import fr.ph.planner.model.Magasin;
import fr.ph.planner.repository.MagasinRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@Transactional
public class MagasinService {

    @Autowired
    private MagasinRepository magasinRepository;

    @Autowired
    private EmployeeService employeeService;

    public List<Magasin> getMagasinsList() {
        return this.magasinRepository.findAll();
    }

    public Magasin addMagasin(Magasin magasin) {
        return this.magasinRepository.save(magasin);
    }

    public Magasin editMagasin(Magasin magasin) {
        Magasin magasinToEdit = this.magasinRepository.getOne(magasin.getId());

        magasinToEdit.setNom(magasin.getNom());
        magasinToEdit.setAdresse(magasin.getAdresse());
        magasinToEdit.setEntreprise(magasin.getEntreprise());
        magasinToEdit.setTel(magasin.getTel());

        return this.magasinRepository.save(magasinToEdit);
    }

    public void deleteMagasin(Long id) {
        this.employeeService.deleteEmployeesByMagasinId(id);
        this.magasinRepository.deleteById(id);
    }
}
