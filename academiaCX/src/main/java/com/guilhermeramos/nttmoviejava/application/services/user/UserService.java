package com.guilhermeramos.nttmoviejava.application.services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guilhermeramos.nttmoviejava.application.entities.user.User;
import com.guilhermeramos.nttmoviejava.application.repositories.user.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserInterfaceService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> list() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return this.userRepository.findById(id);
    }

    @Override
    public User create(User object) {
        return this.userRepository.save(object);
    }

    @Override
    public User update(User object) {
        return this.userRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }
}
