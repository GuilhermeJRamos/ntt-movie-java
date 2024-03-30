package com.guilhermeramos.nttmoviejava.application.repositories.genre;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guilhermeramos.nttmoviejava.application.entities.genre.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
