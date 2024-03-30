package com.guilhermeramos.nttmoviejava.application.controllers.streamming;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.guilhermeramos.nttmoviejava.application.entities.streamming.StreammingInterface;

import java.util.List;

@RestController
@RequestMapping(value = "/streamming")
public class StreammingController implements StreammingInterfaceController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<StreammingInterface>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<StreammingInterface> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<StreammingInterface> save(@RequestBody StreammingInterface streamming) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<StreammingInterface> update(@RequestBody StreammingInterface streamming) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<StreammingInterface> delete(@PathVariable Long id) {
        return null;
    }
}
