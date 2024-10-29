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

        public AsignatureEntity getAsignatureById(Long id) {
            return asignatureRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("No Asignature found with id: " + id));
        }

        public AsignatureEntity createAsignature(AsignatureEntity asignature) {
            return asignatureRepository.save(asignature);
        }

        public AsignatureEntity updateAsignature(Long id, AsignatureEntity asignatureDetails) {
            AsignatureEntity asignature = asignatureRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Asignatura no encontrada con ID: " + id));

            asignature.setName(asignatureDetails.getName());
            asignature.setDescription(asignatureDetails.getDescription());
            asignature.setClassroom(asignatureDetails.getClassroom());
            asignature.setStartTime(asignatureDetails.getStartTime());
            asignature.setEndTime(asignatureDetails.getEndTime());
            asignature.setProfessor(asignatureDetails.getProfessor());

            return asignatureRepository.save(asignature);
        }

        public void deleteAsignature(Long id) {
            asignatureRepository.deleteById(id);
        }
    }
