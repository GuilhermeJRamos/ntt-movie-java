package com.guilhermeramos.nttmoviejava.application.entities.actor;

import jakarta.persistence.*;
import com.guilhermeramos.nttmoviejava.application.entities.movie.Movie;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "actors")
public class Actor implements ActorInterface {
    /* Properties */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String Name;

    @Column(nullable = false)
    private Date Birthdate;

    @Column(nullable = false, length = 50)
    private String Country;

    /* Getters */

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public Date getBirthDate() {
        return this.Birthdate;
    }

    @Override
    public String getCountry() {
        return this.Country;
    }

    /* Setters */

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public void setBirthDate(Date birthDate) {
        this.Birthdate = birthDate;
    }

    @Override
    public void setCountry(String country) {
        this.Country = country;
    }

    /* Relations */

    @ManyToMany()
    private List<Movie> Movies;

    /* Relations Getters */

    @Override
    public List<Movie> getMovies() {
        return this.Movies;
    }

    /* Relations Setters */

    @Override
    public void setMovies(List<Movie> movies) {
        this.Movies = movies;
    }
}
