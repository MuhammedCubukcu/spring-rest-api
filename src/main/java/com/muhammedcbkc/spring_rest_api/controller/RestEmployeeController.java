package com.muhammedcbkc.spring_rest_api.controller;

import com.muhammedcbkc.spring_rest_api.entity.Employee;
import com.muhammedcbkc.spring_rest_api.services.EmoloyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class RestEmployeeController {

    @Autowired
    private EmoloyeeService emoloyeeService;

    @GetMapping(path = "/employees")
    public List<Employee> getAllEmployees() {
        return emoloyeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id) {
        return emoloyeeService.getEmployeeById(id);
    }

}
