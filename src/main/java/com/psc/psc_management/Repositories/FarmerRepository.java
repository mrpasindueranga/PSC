package com.psc.psc_management.Repositories;

import com.psc.psc_management.Models.Farmers;
import org.springframework.data.repository.CrudRepository;

public interface FarmerRepository extends CrudRepository<Farmers, Integer> {
    public Long countById(Integer id);

}
