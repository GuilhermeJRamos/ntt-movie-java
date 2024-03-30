package com.guilhermeramos.nttmoviejava.application.dtos.movie;

import com.guilhermeramos.nttmoviejava.application.dtos.actor.ActorDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.director.DirectorDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.franchise.FranchiseDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.genre.GenreDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.streamming.StreammingDTO;
import com.guilhermeramos.nttmoviejava.application.dtos.studio.StudioDTO;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class MovieDTO implements MovieInterfaceDTO {
    /* Properties */

    private Optional<Long> imdbID;

    private String Title;

    private Date Released;

    private Double Runtime;

    private Optional<String> Plot;

    private String Language;

    private String Country;

    private Optional<String> Awards;

    private Optional<String> Poster;

    /* Getters */

    @Override
    public Optional<Long> getImdbID() {
        return this.imdbID;
    }

    @Override
    public String getTitle() {
        return this.Title;
    }

    @Override
    public Date getReleased() {
        return this.Released;
    }

    @Override
    public Double getRuntime() {
        return this.Runtime;
    }

    @Override
    public Optional<String> getPlot() {
        return this.Plot;
    }

    @Override
    public String getLanguage() {
        return this.Language;
    }

    @Override
    public String getCountry() {
        return this.Country;
    }

    @Override
    public Optional<String> getAwards() {
        return this.Awards;
    }

    @Override
    public Optional<String> getPoster() {
        return this.Poster;
    }

    /* Setters */

    @Override
    public void setImdbID(Long imdbID) {
        this.imdbID = Optional.ofNullable(imdbID);
    }

    @Override
    public void setTitle(String title) {
        this.Title = title;
    }

    @Override
    public void setReleased(Date released) {
        this.Released = released;
    }

    @Override
    public void setRuntime(Double runtime) {
        this.Runtime = runtime;
    }

    @Override
    public void setPlot(String plot) {
        this.Plot = Optional.ofNullable(plot);
    }

    @Override
    public void setLanguage(String language) {
        this.Language = language;
    }

    @Override
    public void setCountry(String country) {
        this.Country = country;
    }

    @Override
    public void setAwards(String awards) {
        this.Awards = Optional.ofNullable(awards);
    }

    @Override
    public void setPoster(String poster) {
        this.Poster = Optional.ofNullable(poster);
    }

    /* Computed */

    @Override
    public Year getYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.Released);

        return Year.of(calendar.get(Calendar.YEAR));
    }

    /* Relations */

    private GenreDTO Genre;

    private StudioDTO Studio;

    private FranchiseDTO Franchise;

    private List<ActorDTO> actorDTOS;

    private List<DirectorDTO> Directors;

    private List<StreammingDTO> Streammings;

    /* Relations Getters */

    @Override
    public GenreDTO getGenre() {
        return this.Genre;
    }

    @Override
    public StudioDTO getStudio() {
        return this.Studio;
    }

    @Override
    public FranchiseDTO getFranchise() {
        return this.Franchise;
    }

    @Override
    public List<ActorDTO> getActors() {
        return this.actorDTOS;
    }

    @Override
    public List<DirectorDTO> getDirectors() {
        return this.Directors;
    }

    @Override
    public List<StreammingDTO> getStreammings() {
        return this.Streammings;
    }

    /* Relations Setters */

    @Override
    public void setGenre(GenreDTO genre) {
        this.Genre = genre;
    }

    @Override
    public void setStudio(StudioDTO studio) {
        this.Studio = studio;
    }

    @Override
    public void setFranchise(FranchiseDTO franchise) {
        this.Franchise = franchise;
    }

    @Override
    public void setActors(List<ActorDTO> actors) {
        this.actorDTOS = actors;
    }

    @Override
    public void setDirectors(List<DirectorDTO> directors) {
        this.Directors = directors;
    }

    @Override
    public void setStreammings(List<StreammingDTO> streammings) {
        this.Streammings = streammings;
    }
}
