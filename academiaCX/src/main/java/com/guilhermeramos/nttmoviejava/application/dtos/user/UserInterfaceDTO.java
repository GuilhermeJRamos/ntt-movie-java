package com.guilhermeramos.nttmoviejava.application.dtos.user;

import com.guilhermeramos.nttmoviejava.application.dtos.movie.MovieDTO;

import java.util.List;

public interface UserInterfaceDTO {
    /* Getters */

    String getName();

    /* Setters */

    void setName(String name);

    /* Relations Getters */

    List<MovieDTO> getFavoriteMovies();

    /* Relations Setters */

    void setFavoriteMovies(List<MovieDTO> movies);
}
