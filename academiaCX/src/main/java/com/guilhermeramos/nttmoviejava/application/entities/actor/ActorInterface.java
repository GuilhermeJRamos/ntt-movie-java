package com.guilhermeramos.nttmoviejava.application.entities.actor;

import com.guilhermeramos.nttmoviejava.application.entities.movie.Movie;
import com.guilhermeramos.nttmoviejava.application.entities.person.IPerson;

import java.util.List;

public interface ActorInterface extends IPerson {
    /* Getters */

    Long getId();

    /* Relations Getters */

    List<Movie> getMovies();

    /* Relations Setters */

    void setMovies(List<Movie> movies);
}
