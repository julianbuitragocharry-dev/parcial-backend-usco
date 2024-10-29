package co.edu.usco.backendparcial.service;

import co.edu.usco.backendparcial.model.AsignatureEntity;
import co.edu.usco.backendparcial.repository.AsignatureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AsignatureService {
    private final AsignatureRepository asignatureRepository;

    public List<AsignatureEntity> getAllAsignatures(){
        return asignatureRepository.findAll();
    }
}
