package com.guilhermeramos.nttmoviejava.application.controllers.director;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.guilhermeramos.nttmoviejava.application.entities.director.DirectorInterface;

import java.util.List;

@RestController
@RequestMapping(value = "/director")
public class DirectorController implements DirectorInterfaceController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<DirectorInterface>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<DirectorInterface> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<DirectorInterface> save(@RequestBody DirectorInterface director) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<DirectorInterface> update(@RequestBody DirectorInterface director) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<DirectorInterface> delete(@PathVariable Long id) {
        return null;
    }
}
