package biblio.dev.service.personne;

import biblio.dev.entity.personne.TypeAdherant;
import biblio.dev.repository.personne.TypeAdherantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeAdherantService {

    @Autowired
    private TypeAdherantRepo typeAdherantRepo;

    public List<TypeAdherant> findAll() {
        return typeAdherantRepo.findAll();
    }

    public TypeAdherant findById(Integer id) {
        Optional<TypeAdherant> typeAdherant = typeAdherantRepo.findById(id);
        return typeAdherant.orElse(null);
    }

    public TypeAdherant save(TypeAdherant typeAdherant) {
        return typeAdherantRepo.save(typeAdherant);
    }

    public void deleteById(Integer id) {
        typeAdherantRepo.deleteById(id);
    }

    
}
