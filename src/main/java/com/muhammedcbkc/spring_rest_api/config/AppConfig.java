package com.muhammedcbkc.spring_rest_api.config;

import com.muhammedcbkc.spring_rest_api.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Muhammed", "CBKC"));
        employeeList.add(new Employee("2", "Dean", "Wincster"));
        employeeList.add(new Employee("3", "Jack", "Wincster"));
        employeeList.add(new Employee("4", "Sam", "Wincster"));

        return employeeList;
    }
}
