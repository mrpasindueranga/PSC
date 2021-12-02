package com.psc.psc_management.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.psc.psc_management.Models.Employees;
import com.psc.psc_management.Repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employees> getAll() {
        List<Employees> employees = new ArrayList<Employees>();
        repository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }

    public void save(Employees employee) {
        repository.save(employee);
    }

    public Employees getEmployees(Integer id) throws EmployeeNotFoundException {
        Optional<Employees> result = repository.findById(id);

        if (result.isPresent()) {
            return result.get();
        }
        throw new EmployeeNotFoundException("Could not find any Employee with Id" + id);
    }

    public void deleteEmployees(Integer id) throws EmployeeNotFoundException {
        Long count = repository.countById(id);
        if (count == null || count == 0) {
            throw new EmployeeNotFoundException("Could not find any Farmer  with Id" + id);
        }
        repository.deleteById(id);
    }

}
