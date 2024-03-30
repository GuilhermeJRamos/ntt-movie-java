package com.guilhermeramos.nttmoviejava.application.entities.studio;

import com.guilhermeramos.nttmoviejava.application.entities.movie.Movie;

import java.util.List;

public interface StudioInterface {
    /* Getters */

    public Long getId();

    public String getName();

    public String getCountry();

    /* Setters */

    public void setId(Long id);

    public void setName(String name);

    public void setCountry(String country);

    /* Relations Getters */

    public List<Movie> getMovies();

    /* Relations Setters */

    public void setMovies(List<Movie> movies);
}
