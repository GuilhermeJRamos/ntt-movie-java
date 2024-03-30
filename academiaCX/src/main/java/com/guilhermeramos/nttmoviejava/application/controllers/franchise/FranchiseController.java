package com.guilhermeramos.nttmoviejava.application.controllers.franchise;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.guilhermeramos.nttmoviejava.application.entities.franchise.FranchiseInterface;

import java.util.List;

@RestController
@RequestMapping(value = "/franchise")
public class FranchiseController implements FranchiseInterfaceController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<FranchiseInterface>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<FranchiseInterface> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<FranchiseInterface> save(@RequestBody FranchiseInterface franchise) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<FranchiseInterface> update(@RequestBody FranchiseInterface franchise) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<FranchiseInterface> delete(@PathVariable Long id) {
        return null;
    }
}
