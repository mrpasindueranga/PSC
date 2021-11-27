package com.psc.psc_management.Repositories;

import com.psc.psc_management.Models.Vehicles;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicles, Integer> {
    public Long countById(Integer id);
}
