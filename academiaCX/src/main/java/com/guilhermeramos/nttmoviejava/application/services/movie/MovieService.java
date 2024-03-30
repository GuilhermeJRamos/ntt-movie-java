package com.guilhermeramos.nttmoviejava.application.services.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guilhermeramos.nttmoviejava.application.entities.movie.Movie;
import com.guilhermeramos.nttmoviejava.application.repositories.movie.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService implements MovieInterfaceService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> list() {
        return this.movieRepository.findAll();
    }

    @Override
    public Optional<Movie> findById(Long id) {
        return this.movieRepository.findById(id);
    }

    @Override
    public Movie create(Movie object) {
        return this.movieRepository.save(object);
    }

    @Override
    public Movie update(Movie object) {
        return this.movieRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.movieRepository.deleteById(id);
    }
}
