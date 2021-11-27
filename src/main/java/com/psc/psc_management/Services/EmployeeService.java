package com.psc.psc_management.Services;

import com.psc.psc_management.Models.Employees;
import com.psc.psc_management.Repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public void save(Employees employee) {
        repository.save(employee);
    }
}
