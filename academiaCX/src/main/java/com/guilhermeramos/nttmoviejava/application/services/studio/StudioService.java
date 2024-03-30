package com.guilhermeramos.nttmoviejava.application.services.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guilhermeramos.nttmoviejava.application.entities.studio.Studio;
import com.guilhermeramos.nttmoviejava.application.repositories.studio.StudioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudioService implements StudioInterfaceService {
    private final StudioRepository studioRepository;

    @Autowired
    public StudioService(StudioRepository studioRepository) {
        this.studioRepository = studioRepository;
    }

    @Override
    public List<Studio> list() {
        return this.studioRepository.findAll();
    }

    @Override
    public Optional<Studio> findById(Long id) {
        return this.studioRepository.findById(id);
    }

    @Override
    public Studio create(Studio object) {
        return this.studioRepository.save(object);
    }

    @Override
    public Studio update(Studio object) {
        return this.studioRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.studioRepository.deleteById(id);
    }
}
