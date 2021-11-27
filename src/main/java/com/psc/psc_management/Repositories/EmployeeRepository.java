package com.psc.psc_management.Repositories;

import com.psc.psc_management.Models.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employees, Integer> {
    public Long countById(Integer id);
}
