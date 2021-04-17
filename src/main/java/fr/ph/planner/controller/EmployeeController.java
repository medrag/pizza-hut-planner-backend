package fr.ph.planner.controller;

import fr.ph.planner.model.Employee;
import fr.ph.planner.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.ok(this.employeeService.getEmployeesList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(this.employeeService.getEmployeeById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        this.employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/ajouter")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(this.employeeService.addEmployee(employee));
    }

    @PutMapping("/modifier")
    public ResponseEntity<Employee> editEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(this.employeeService.editEmployee(employee));
    }

    @GetMapping("/magasin/{id}")
    public ResponseEntity<List<Employee>> getEmployeesByMagasinId(@PathVariable Long id) {
        return ResponseEntity.ok(this.employeeService.getEmployeesByMagasinId(id));
    }

}
