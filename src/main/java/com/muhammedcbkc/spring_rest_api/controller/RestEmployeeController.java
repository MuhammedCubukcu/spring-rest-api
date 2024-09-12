package com.muhammedcbkc.spring_rest_api.controller;

import com.muhammedcbkc.spring_rest_api.entity.Employee;
import com.muhammedcbkc.spring_rest_api.services.EmoloyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmoloyeeService emoloyeeService;

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployees() {
        return emoloyeeService.getAllEmployees();
    }

    @GetMapping("/list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id) {
        return emoloyeeService.getEmployeeById(id);
    }

    @GetMapping("/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName", required = false) String firstName,
                                                @RequestParam(name = "lastName",  required = false)  String lastName){
        return emoloyeeService.getEmployeeWihtParams(firstName, lastName);
    }

    @PostMapping("/save-employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return emoloyeeService.addEmployee(employee);
    }



}
