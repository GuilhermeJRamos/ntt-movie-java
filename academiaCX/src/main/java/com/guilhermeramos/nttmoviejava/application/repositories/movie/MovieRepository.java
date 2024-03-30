package com.guilhermeramos.nttmoviejava.application.repositories.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guilhermeramos.nttmoviejava.application.entities.movie.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
