package com.guilhermeramos.nttmoviejava.application.entities.user;

import com.guilhermeramos.nttmoviejava.application.entities.movie.Movie;

import java.util.List;

public interface UserInterface {
    /* Getters */

    Long getId();

    String getName();

    /* Setters */

    void setId(Long id);

    void setName(String name);

    /* Relations Getters */

    List<Movie> getFavoriteMovies();

    /* Relations Setters */

    void setFavoriteMovies(List<Movie> movies);
}
