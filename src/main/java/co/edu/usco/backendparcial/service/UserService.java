package co.edu.usco.backendparcial.service;

import co.edu.usco.backendparcial.model.UserEntity;
import co.edu.usco.backendparcial.repository.UserRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserEntity> getAllProfessors() {
        return userRepository.findByRoles_RolName("DOCENTE");
    }
}
