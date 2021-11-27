package com.psc.psc_management.Services;

import com.psc.psc_management.Models.Branches;
import com.psc.psc_management.Repositories.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BranchService {
    @Autowired
    private BranchRepository repository;

    public List<Branches> getAll() {
        List<Branches> branches = new ArrayList<Branches>();
        repository.findAll().forEach(branch -> branches.add(branch));
        return branches;
    }

    public void save(Branches branch) {
        repository.save(branch);
    }

    public Branches getBrunches(Integer id) throws BranchNotFoundException {
        Optional<Branches> result = repository.findById(id);

        if (result.isPresent()) {
            return result.get();
        }
        throw new BranchNotFoundException("Could not find any Branch with Id" + id);
    }

    public void deleteBrunches(Integer id) throws BranchNotFoundException {
        Long count = repository.countById(id);
        if (count == null || count == 0) {
            throw new BranchNotFoundException("Could not find any Brunch with Id" + id);
        }
        repository.deleteById(id);
    }
}
