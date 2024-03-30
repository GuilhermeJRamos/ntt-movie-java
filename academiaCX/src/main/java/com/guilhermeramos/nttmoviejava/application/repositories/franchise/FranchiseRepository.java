package com.guilhermeramos.nttmoviejava.application.repositories.franchise;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guilhermeramos.nttmoviejava.application.entities.franchise.Franchise;

public interface FranchiseRepository extends JpaRepository<Franchise, Long> {
}
