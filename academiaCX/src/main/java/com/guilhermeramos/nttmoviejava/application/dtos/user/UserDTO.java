package com.guilhermeramos.nttmoviejava.application.dtos.user;

import com.guilhermeramos.nttmoviejava.application.dtos.movie.MovieDTO;

import java.util.List;

public class UserDTO implements UserInterfaceDTO {
    /* Properties */

    private String name;

    /* Getters */

    public String getName() {
        return this.name;
    }

    /* Setters */

    public void setName(String name) {
        this.name = name;
    }

    /* Relations */

    private List<MovieDTO> FavoriteMovies;

    /* Relations Getters */

    @Override
    public List<MovieDTO> getFavoriteMovies() {
        return this.FavoriteMovies;
    }

    /* Relations Setters */

    @Override
    public void setFavoriteMovies(List<MovieDTO> movies) {
        this.FavoriteMovies = movies;
    }
}
