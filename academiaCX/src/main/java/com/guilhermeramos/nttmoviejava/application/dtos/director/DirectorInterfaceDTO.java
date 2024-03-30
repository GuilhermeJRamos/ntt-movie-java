package com.guilhermeramos.nttmoviejava.application.dtos.director;

import com.guilhermeramos.nttmoviejava.application.dtos.movie.MovieDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.person.IPersonDTO;

import java.util.List;

public interface DirectorInterfaceDTO extends IPersonDTO {
    /* Relations Getters */

    List<MovieDTO> getMovies();

    /* Relations Setters */

    void setMovies(List<MovieDTO> movies);
}
