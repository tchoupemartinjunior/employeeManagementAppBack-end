package com.tchoupe.employeeManager.service;

import com.tchoupe.employeeManager.exception.EmployeeNotFoundException;
import com.tchoupe.employeeManager.model.Employee;
import com.tchoupe.employeeManager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(long id){
        employeeRepo.deleteById(id);
    }
    public Employee findEmployeeById(long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(()-> new EmployeeNotFoundException("Employee with id "+ id +" was not found"));
    }


}
