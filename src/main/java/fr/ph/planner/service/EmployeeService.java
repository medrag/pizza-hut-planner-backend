package fr.ph.planner.service;

import fr.ph.planner.model.Employee;
import fr.ph.planner.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeRepository;

    public List<Employee> getEmployeesList() {
        return this.employeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return this.employeRepository.save(employee);
    }

    public Employee editEmployee(Employee employee) {
        Employee employeeToEdit = this.employeRepository.getOne(employee.getId());
        employeeToEdit.setNomComplet(employee.getNomComplet());
        employeeToEdit.setAdresse(employee.getAdresse());
        employeeToEdit.setContrat(employee.getContrat());
        employeeToEdit.setDateNaissance(employee.getDateNaissance());
        employeeToEdit.setMail(employee.getMail());
        employeeToEdit.setPoste(employee.getPoste());
        employeeToEdit.setTel(employee.getTel());
        employeeToEdit.setMagasin(employee.getMagasin());

        return this.employeRepository.save(employeeToEdit);
    }

    public void deleteEmployee(Long empId) {
        this.employeRepository.deleteById(empId);
    }

    public void deleteEmployeesByMagasinId(Long magasinId) {
        this.employeRepository.deleteAllByMagasinId(magasinId);
    }
}
