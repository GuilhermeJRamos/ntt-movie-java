package com.guilhermeramos.nttmoviejava.application.dtos.streamming;

import com.guilhermeramos.nttmoviejava.application.dtos.movie.MovieDTO;

import java.util.List;


public class StreammingDTO implements StreammingInterfaceDTO {

    /* Properties */

    private String Name;

    private String Url;

    /* Getters */

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public String getUrl() {
        return this.Url;
    }

    /* Setters */

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public void setUrl(String url) {
        this.Url = url;
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
