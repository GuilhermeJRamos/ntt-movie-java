package com.guilhermeramos.nttmoviejava.application.controllers.principal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PrincipalInterfaceController<T> {
    ResponseEntity<List<T>> findAll();

    ResponseEntity<T> findById(@PathVariable Long id);

    ResponseEntity<T> save(@RequestBody  T object);

    ResponseEntity<T> update(@RequestBody T object);

    ResponseEntity<T> delete(@PathVariable Long id);
}
