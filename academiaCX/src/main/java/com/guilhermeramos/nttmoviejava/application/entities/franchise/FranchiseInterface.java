package com.guilhermeramos.nttmoviejava.application.entities.franchise;

import com.guilhermeramos.nttmoviejava.application.entities.movie.Movie;

import java.util.List;

public interface FranchiseInterface {
    /* Getters */

    public Long getId();

    public String getName();

    /* Setters */

    public void setId(Long id);

    public void setName(String name);

    /* Relations Getters */

    public List<Movie> getMovies();

    /* Relations Setters */

    public void setMovies(List<Movie> movies);
}
