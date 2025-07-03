package biblio.dev.service.personne;

import biblio.dev.entity.personne.Adherant;
import biblio.dev.repository.personne.AdherantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdherantService {

    @Autowired
    private AdherantRepo adherantRepo;

    public List<Adherant> findAll() {
        return adherantRepo.findAll();
    }

    public Adherant findById(Integer id) {
        Optional<Adherant> adherant = adherantRepo.findById(id);
        return adherant.orElse(null);
    }

    public Adherant save(Adherant adherant) {
        return adherantRepo.save(adherant);
    }

    public void deleteById(Integer id) {
        adherantRepo.deleteById(id);
    }
}
