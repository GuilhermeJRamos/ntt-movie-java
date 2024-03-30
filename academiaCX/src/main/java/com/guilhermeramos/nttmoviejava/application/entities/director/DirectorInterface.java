package com.guilhermeramos.nttmoviejava.application.entities.director;

import com.guilhermeramos.nttmoviejava.application.entities.movie.Movie;
import com.guilhermeramos.nttmoviejava.application.entities.person.IPerson;

import java.util.List;

public interface DirectorInterface extends IPerson {
    /* Getters */

    Long getId();

    /* Relations Getters */

    List<Movie> getMovies();

    /* Relations Setters */

    void setMovies(List<Movie> movies);
}
