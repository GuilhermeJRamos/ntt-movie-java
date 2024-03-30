package com.guilhermeramos.nttmoviejava.application.entities.franchise;

import jakarta.persistence.*;
import com.guilhermeramos.nttmoviejava.application.entities.movie.Movie;

import java.util.List;

@Entity
@Table(name = "franchises")
public class Franchise implements FranchiseInterface {
    /* Properties */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String Name;

    /* Getters */

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    /* Setters */

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    /* Relations */

    @OneToMany()
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
