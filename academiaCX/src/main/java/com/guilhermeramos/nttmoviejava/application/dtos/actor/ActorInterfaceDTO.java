package com.guilhermeramos.nttmoviejava.application.dtos.actor;

import com.guilhermeramos.nttmoviejava.application.dtos.person.IPersonDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.movie.MovieDTO;

import java.util.List;

public interface ActorInterfaceDTO extends IPersonDTO {
    /* Relations Getters */

    List<MovieDTO> getMovies();

    /* Relations Setters */

    void setMovies(List<MovieDTO> movies);
}
