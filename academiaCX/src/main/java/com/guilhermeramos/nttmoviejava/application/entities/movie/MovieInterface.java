package com.guilhermeramos.nttmoviejava.application.entities.movie;

import com.guilhermeramos.nttmoviejava.application.entities.director.Director;
import com.guilhermeramos.nttmoviejava.application.entities.franchise.Franchise;
import com.guilhermeramos.nttmoviejava.application.entities.genre.Genre;
import com.guilhermeramos.nttmoviejava.application.entities.studio.Studio;
import com.guilhermeramos.nttmoviejava.application.entities.actor.Actor;
import com.guilhermeramos.nttmoviejava.application.entities.streamming.Streamming;

import java.time.Year;
import java.util.Date;
import java.util.List;

public interface MovieInterface {
    /* Getters */

    Long getImdbID();

    String getTitle();

    Date getReleased();

    Double getRuntime();

    /*Director getDirector();*/

    /*ArrayList<Actor> getActors();*/

    String getPlot();

    String getLanguage();

    String getCountry();

    String getAwards();

    String getPoster();

    /* Setters */

    void setImdbID(Long imdbID);

    void setTitle(String title);

    void setReleased(Date released);

    void setRuntime(Double runtime);

    /*void setDirector(Director director);*/

    /*void setActors(ArrayList<Actor> actors);*/

    void setPlot(String plot);

    void setLanguage(String language);

    void setCountry(String country);

    void setAwards(String awards);

    void setPoster(String poster);

    /* Computed */

    Year getYear();

    /* Relations Getters */

    Genre getGenre();

    Studio getStudio();

    Franchise getFranchise();

    List<Actor> getActors();

    List<Director> getDirectors();

    List<Streamming> getStreammings();

    /* Relations Setters */

    void setGenre(Genre genre);

    void setStudio(Studio studio);

    void setFranchise(Franchise franchise);

    void setActors(List<Actor> actors);

    void setDirectors(List<Director> directors);

    void setStreammings(List<Streamming> streammings);
}
