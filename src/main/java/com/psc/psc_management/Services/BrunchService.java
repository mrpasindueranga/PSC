package com.psc.psc_management.Services;

import com.psc.psc_management.Models.Branches;
import com.psc.psc_management.Repositories.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import java.util.List;
import java.util.Optional;

@Service
public class BrunchService {
    @Autowired
    private BranchRepository repository;

    // public List<Branches> listEmployeesByBranch(String branch){
    // return (List<Branches>) repository.findByBranch(branch);
    // }

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
