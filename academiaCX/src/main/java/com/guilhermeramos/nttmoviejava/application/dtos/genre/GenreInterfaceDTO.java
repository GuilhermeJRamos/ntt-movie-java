package com.guilhermeramos.nttmoviejava.application.dtos.genre;

import com.guilhermeramos.nttmoviejava.application.dtos.movie.MovieDTO;

import java.util.List;

public interface GenreInterfaceDTO {
    /* Getters */

    String getName();

    /* Setters */

    void setName(String name);

    /* Relations Getters */

    List<MovieDTO> getMovies();

    /* Relations Setters */

    void setMovies(List<MovieDTO> movies);
}
