package com.guilhermeramos.nttmoviejava.application.repositories.streamming;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guilhermeramos.nttmoviejava.application.entities.streamming.Streamming;

public interface StreammingRepository extends JpaRepository<Streamming, Long> {
}
