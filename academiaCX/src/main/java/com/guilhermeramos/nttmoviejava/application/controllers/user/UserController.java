package com.guilhermeramos.nttmoviejava.application.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.guilhermeramos.nttmoviejava.application.entities.user.UserInterface;

@RestController
@RequestMapping(value = "/user")
public class UserController implements UserInterfaceController {
    @PostMapping(value = "/save")
    @Override
    public ResponseEntity<UserInterface> save(@RequestBody UserInterface user) {
        return null;
    }
}
