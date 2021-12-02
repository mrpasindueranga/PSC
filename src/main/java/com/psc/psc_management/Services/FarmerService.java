package com.psc.psc_management.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.psc.psc_management.Models.Farmers;
import com.psc.psc_management.Repositories.FarmerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmerService {
    @Autowired
    private FarmerRepository repository;

    public List<Farmers> getAll() {
        List<Farmers> farmers = new ArrayList<Farmers>();
        repository.findAll().forEach(farmer -> farmers.add(farmer));
        return farmers;
    }

    public void save(Farmers farmer) {
        repository.save(farmer);
    }

    public Farmers getFarmers(Integer id) throws FarmerNotFoundException {
        Optional<Farmers> result = repository.findById(id);

        if (result.isPresent()) {
            return result.get();
        }
        throw new FarmerNotFoundException("Could not find any Farmer with Id" + id);
    }

    public void deleteFarmers(Integer id) throws FarmerNotFoundException {
        Long count = repository.countById(id);
        if (count == null || count == 0) {
            throw new FarmerNotFoundException("Could not find any Farmer with Id" + id);
        }
        repository.deleteById(id);
    }
}
