package com.guilhermeramos.nttmoviejava.application.repositories.director;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guilhermeramos.nttmoviejava.application.entities.director.Director;

public interface DirectorRepository extends JpaRepository<Director, Long> {
}
