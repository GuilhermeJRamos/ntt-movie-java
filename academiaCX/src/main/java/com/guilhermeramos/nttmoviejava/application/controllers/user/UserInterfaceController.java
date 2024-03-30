package com.guilhermeramos.nttmoviejava.application.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import com.guilhermeramos.nttmoviejava.application.entities.user.UserInterface;

public interface UserInterfaceController {
    ResponseEntity<UserInterface> save(@RequestBody UserInterface user);
}
