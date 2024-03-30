package com.guilhermeramos.nttmoviejava.application.dtos.franchise;

import com.guilhermeramos.nttmoviejava.application.dtos.movie.MovieDTO;

import java.util.List;

public interface FranchiseInterfaceDTO {
    /* Getters */

    public String getName();

    /* Setters */

    public void setName(String name);

    /* Relations Getters */

    public List<MovieDTO> getMovies();

    /* Relations Setters */

    public void setMovies(List<MovieDTO> movies);
}
