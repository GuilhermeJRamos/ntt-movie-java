package com.guilhermeramos.nttmoviejava.application.dtos.franchise;

import com.guilhermeramos.nttmoviejava.application.dtos.movie.MovieDTO;

import java.util.List;

public class FranchiseDTO implements FranchiseInterfaceDTO {
    /* Properties */

    private String Name;

    /* Getters */

    @Override
    public String getName() {
        return this.Name;
    }

    /* Setters */

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    /* Relations */

    private List<MovieDTO> Movies;

    /* Relations Getters */

    @Override
    public List<MovieDTO> getMovies() {
        return this.Movies;
    }

    /* Relations Setters */

    @Override
    public void setMovies(List<MovieDTO> movies) {
        this.Movies = movies;
    }
}
