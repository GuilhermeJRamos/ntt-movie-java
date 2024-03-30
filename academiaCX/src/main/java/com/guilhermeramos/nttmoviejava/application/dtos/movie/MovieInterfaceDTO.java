package com.guilhermeramos.nttmoviejava.application.dtos.movie;

import com.guilhermeramos.nttmoviejava.application.dtos.franchise.FranchiseDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.streamming.StreammingDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.actor.ActorDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.director.DirectorDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.genre.GenreDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.studio.StudioDTO;

import java.time.Year;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface MovieInterfaceDTO {
    /* Getters */

    Optional<Long> getImdbID();

    String getTitle();

    Date getReleased();

    Double getRuntime();

    Optional<String> getPlot();

    String getLanguage();

    String getCountry();

    Optional<String> getAwards();

    Optional<String> getPoster();

    /* Setters */

    void setImdbID(Long imdbID);

    void setTitle(String title);

    void setReleased(Date released);

    void setRuntime(Double runtime);

    void setPlot(String plot);

    void setLanguage(String language);

    void setCountry(String country);

    void setAwards(String awards);

    void setPoster(String poster);

    /* Computed */

    Year getYear();

    /* Relations Getters */

    GenreDTO getGenre();

    StudioDTO getStudio();

    FranchiseDTO getFranchise();

    List<ActorDTO> getActors();

    List<DirectorDTO> getDirectors();

    List<StreammingDTO> getStreammings();

    /* Relations Setters */

    void setGenre(GenreDTO genre);

    void setStudio(StudioDTO studio);

    void setFranchise(FranchiseDTO franchise);

    void setActors(List<ActorDTO> actorDTOS);

    void setDirectors(List<DirectorDTO> directors);

    void setStreammings(List<StreammingDTO> streammings);
}
