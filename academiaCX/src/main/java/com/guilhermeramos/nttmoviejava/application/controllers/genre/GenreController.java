package com.guilhermeramos.nttmoviejava.application.controllers.genre;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.guilhermeramos.nttmoviejava.application.entities.genre.GenreInterface;

import java.util.List;

@RestController
@RequestMapping(value = "/genre")
public class GenreController implements GenreInterfaceController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<GenreInterface>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<GenreInterface> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<GenreInterface> save(@RequestBody GenreInterface genre) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<GenreInterface> update(@RequestBody GenreInterface genre) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<GenreInterface> delete(@PathVariable Long id) {
        return null;
    }
}
