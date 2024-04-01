package com.guilhermeramos.nttmoviejava.application.facades.user.impl;

import com.guilhermeramos.nttmoviejava.application.dtos.user.UserDTO;
import com.guilhermeramos.nttmoviejava.application.entities.user.User;
import com.guilhermeramos.nttmoviejava.application.services.user.UserInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserFacade {

    private final UserInterfaceService userService;

    @Autowired
    public UserFacade(UserInterfaceService userService) {
        this.userService = userService;
    }

    public ResponseEntity<UserDTO> save(UserDTO userDTO) {

        User user = convertToUser(userDTO);
        User savedUser = userService.create(user);
        UserDTO savedUserDTO = convertToUserDTO(savedUser);
        return ResponseEntity.ok(savedUserDTO);
    }


    private User convertToUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        return user;
    }

    private UserDTO convertToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        return userDTO;
    }
}
