package com.psc.psc_management.Repositories;

import com.psc.psc_management.Models.Branches;
import org.springframework.data.repository.CrudRepository;

public interface BranchRepository extends CrudRepository<Branches, Integer> {
    public Long countById(Integer id);

    // public Iterable<Branches> findByBranch(String branch);
}
