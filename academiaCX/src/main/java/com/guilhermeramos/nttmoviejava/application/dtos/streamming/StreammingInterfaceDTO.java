package com.guilhermeramos.nttmoviejava.application.dtos.streamming;

import com.guilhermeramos.nttmoviejava.application.dtos.movie.MovieDTO;

import java.util.List;

public interface StreammingInterfaceDTO {
    /* Getters */

    public String getName();

    public String getUrl();

    /* Setters */

    public void setName(String name);

    public void setUrl(String url);

    /* Relations Getters */

    public List<MovieDTO> getMovies();

    /* Relations Setters */

    public void setMovies(List<MovieDTO> movies);
}
