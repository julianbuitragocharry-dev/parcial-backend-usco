package co.edu.usco.backendparcial.repository;

import co.edu.usco.backendparcial.model.AsignatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignatureRepository extends JpaRepository<AsignatureEntity, Long> {}
