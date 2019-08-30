package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tws.DTO.EmployeeDTO;
import tws.entity.Employee;
import tws.repository.EmployeeMapper;
import tws.servvice.EmployeeService;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public ResponseEntity<List<Employee>> queryEmployees (@RequestParam(required = false) String id) {
        List<Employee> list = employeeMapper.selectSome(id);
        return ResponseEntity.ok(list);
    }
    
    @GetMapping()
    public ResponseEntity<List<EmployeeDTO>> queryEmployeeDTO (@RequestParam(required = false) String id) {
        List<EmployeeDTO> list = employeeService.selectSomeWithDesc(id);
        return ResponseEntity.ok(list);
    }

    @PostMapping("")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        employeeMapper.addEmploy(employee);
        return ResponseEntity.created(URI.create(URI.create("/employees")+employee.getId())).build();
    }

    @PutMapping("")
    public ResponseEntity<Employee> uodateEmployee(@RequestBody Employee employee) {
        employeeMapper.updateOne(employee);
        return ResponseEntity.ok(employee);
    }

    @DeleteMapping("")
    public ResponseEntity<String> deleteEmployee(@RequestParam String id) {
        employeeMapper.deleteOne(id);
        return ResponseEntity.ok(id);
    }

}
