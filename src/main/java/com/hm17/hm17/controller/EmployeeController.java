package com.hm17.hm17.controller;

import com.hm17.hm17.model.Employee;
import com.hm17.hm17.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public Collection<Employee> all() {
    return employeeService.getAll();
    }

    @GetMapping("/add")
        public Employee add(String firstName, String lastName) {
        return employeeService.add(new Employee(firstName, lastName));
    }
    @GetMapping("/remove")
    public Employee remove(String firstName, String lastName) {
        return employeeService.remove(firstName, lastName);
    }
    @GetMapping("/find")
    public Employee find(String firstName, String lastName) {
        return employeeService.find(firstName, lastName);
    }
}
