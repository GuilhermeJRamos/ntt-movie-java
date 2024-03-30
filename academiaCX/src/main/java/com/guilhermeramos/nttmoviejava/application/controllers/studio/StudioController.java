package com.guilhermeramos.nttmoviejava.application.controllers.studio;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.guilhermeramos.nttmoviejava.application.entities.studio.StudioInterface;

import java.util.List;

@RestController
@RequestMapping(value = "/studio")
public class StudioController implements StudioInterfaceController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<StudioInterface>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<StudioInterface> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<StudioInterface> save(@RequestBody StudioInterface studio) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<StudioInterface> update(@RequestBody StudioInterface studio) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<StudioInterface> delete(@PathVariable Long id) {
        return null;
    }
}
