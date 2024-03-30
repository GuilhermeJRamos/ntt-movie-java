package com.guilhermeramos.nttmoviejava.application.services.franchise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guilhermeramos.nttmoviejava.application.entities.franchise.Franchise;
import com.guilhermeramos.nttmoviejava.application.repositories.franchise.FranchiseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FranchiseService implements FranchiseInterfaceService {
    private final FranchiseRepository franchiseRepository;

    @Autowired
    public FranchiseService(FranchiseRepository franchiseRepository) {
        this.franchiseRepository = franchiseRepository;
    }

    @Override
    public List<Franchise> list() {
        return this.franchiseRepository.findAll();
    }

    @Override
    public Optional<Franchise> findById(Long id) {
        return this.franchiseRepository.findById(id);
    }

    @Override
    public Franchise create(Franchise object) {
        return this.franchiseRepository.save(object);
    }

    @Override
    public Franchise update(Franchise object) {
        return this.franchiseRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.franchiseRepository.deleteById(id);
    }
}
