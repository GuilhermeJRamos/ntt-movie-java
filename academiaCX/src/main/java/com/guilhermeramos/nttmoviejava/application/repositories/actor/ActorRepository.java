package com.guilhermeramos.nttmoviejava.application.repositories.actor;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guilhermeramos.nttmoviejava.application.entities.actor.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}
