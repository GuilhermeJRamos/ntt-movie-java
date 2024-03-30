package com.guilhermeramos.nttmoviejava.application.entities.genre;

import com.guilhermeramos.nttmoviejava.application.entities.movie.Movie;

import java.util.List;

public interface GenreInterface {
    /* Getters */

    Long getId();

    String getName();

    /* Setters */

    void setId(Long id);

    void setName(String name);

    /* Relations Getters */

    List<Movie> getMovies();

    /* Relations Setters */

    void setMovies(List<Movie> movies);
}
