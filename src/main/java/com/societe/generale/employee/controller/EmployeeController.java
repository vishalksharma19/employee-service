package com.societe.generale.employee.controller;

import com.societe.generale.employee.dto.EmployeeDTO;
import com.societe.generale.employee.repository.entity.Employee;
import com.societe.generale.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/employee-service/v1/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("employee")
    public Employee createEmployee(@RequestBody @Validated EmployeeDTO employeeDTO){
         return employeeService.createNewEmployee(employeeDTO);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getExistingEmployee();
    }
}
