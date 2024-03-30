package com.guilhermeramos.nttmoviejava.application.services.streamming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guilhermeramos.nttmoviejava.application.entities.streamming.Streamming;
import com.guilhermeramos.nttmoviejava.application.repositories.streamming.StreammingRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StreammingService implements StreammingInterfaceService {
    private final StreammingRepository streammingRepository;

    @Autowired
    public StreammingService(StreammingRepository streammingRepository) {
        this.streammingRepository = streammingRepository;
    }

    @Override
    public List<Streamming> list() {
        return this.streammingRepository.findAll();
    }

    @Override
    public Optional<Streamming> findById(Long id) {
        return this.streammingRepository.findById(id);
    }

    @Override
    public Streamming create(Streamming object) {
        return this.streammingRepository.save(object);
    }

    @Override
    public Streamming update(Streamming object) {
        return this.streammingRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.streammingRepository.deleteById(id);
    }
}
