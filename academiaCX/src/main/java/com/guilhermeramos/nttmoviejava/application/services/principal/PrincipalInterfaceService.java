package com.guilhermeramos.nttmoviejava.application.services.principal;

import java.util.List;
import java.util.Optional;

public interface PrincipalInterfaceService<T> {
    List<T> list();

    Optional<T> findById(Long id);

    T create(T object);

    T update(T object);

    void delete(Long id);
}
