package com.guilhermeramos.nttmoviejava.application.controllers.actor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.guilhermeramos.nttmoviejava.application.entities.actor.ActorInterface;

import java.util.List;

@RestController
@RequestMapping(value = "/actor")
public class ActorController implements ActorInterfaceController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<ActorInterface>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<ActorInterface> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<ActorInterface> save(@RequestBody ActorInterface actor) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<ActorInterface> update(@RequestBody ActorInterface actor) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<ActorInterface> delete(@PathVariable Long id) {
        return null;
    }
}
