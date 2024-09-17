package com.muhammedcbkc.spring_rest_api.controller;

import com.muhammedcbkc.spring_rest_api.entity.Employee;
import com.muhammedcbkc.spring_rest_api.services.EmoloyeeService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmoloyeeService employeeService;

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName", required = false) String firstName,
                                                @RequestParam(name = "lastName",  required = false)  String lastName){
        return employeeService.getEmployeeWihtParams(firstName, lastName);
    }

    @PostMapping("/save-employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public List<Employee> deleteEmployee(@PathVariable(name = "id", required = true) String id) {
        return employeeService.deleteEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable(name = "id", required = true) String id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id,employee);
    }


}
