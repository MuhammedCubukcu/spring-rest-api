package com.muhammedcbkc.spring_rest_api.services;


import com.muhammedcbkc.spring_rest_api.entity.Employee;
import com.muhammedcbkc.spring_rest_api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmoloyeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployee();
    }
    public Employee getEmployeeById(String id) {
        return employeeRepository.getEmployeeById(id);
    }

    public List<Employee> getEmployeeWihtParams(String firstName, String lastName) {
        return employeeRepository.getEmployeeWithParams(firstName, lastName);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.addEmployee(employee);
    }

    public List<Employee> deleteEmployeeById(String id) {
        return employeeRepository.deleteEmployeeById(id);
    }

    public Employee updateEmployee(String id,Employee employee) {
        return employeeRepository.updateEmployee(id,employee);
    }
}
