package com.guilhermeramos.nttmoviejava.application.controllers.movie;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.guilhermeramos.nttmoviejava.application.entities.movie.MovieInterface;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")
public class MovieController implements MovieInterfaceController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<MovieInterface>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<MovieInterface> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<MovieInterface> save(@RequestBody MovieInterface movie) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<MovieInterface> update(@RequestBody MovieInterface movie) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<MovieInterface> delete(@PathVariable Long id) {
        return null;
    }
}
