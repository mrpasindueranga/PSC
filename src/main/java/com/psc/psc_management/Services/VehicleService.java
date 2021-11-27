package com.psc.psc_management.Services;

import com.psc.psc_management.Models.Vehicles;
import com.psc.psc_management.Repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository repository;

    public List<Vehicles> getAll() {
        List<Vehicles> vehicles = new ArrayList<Vehicles>();
        repository.findAll().forEach(vehicle -> vehicles.add(vehicle));
        return vehicles;
    }

    public void save(Vehicles vehicle) {
        repository.save(vehicle);
    }

    public Vehicles getBrunches(Integer id) throws VehicleNotFoundException {
        Optional<Vehicles> result = repository.findById(id);

        if (result.isPresent()) {
            return result.get();
        }
        throw new VehicleNotFoundException("Could not find any Vehicle with Id" + id);
    }

    public void deleteVehicle(Integer id) throws VehicleNotFoundException {
        Long count = repository.countById(id);
        if (count == null || count == 0) {
            throw new VehicleNotFoundException("Could not find any Vehicle with Id" + id);
        }
        repository.deleteById(id);
    }
}
