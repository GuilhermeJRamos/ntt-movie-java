package com.guilhermeramos.nttmoviejava.application.repositories.studio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guilhermeramos.nttmoviejava.application.entities.studio.Studio;

public interface StudioRepository extends JpaRepository<Studio, Long> {
}
