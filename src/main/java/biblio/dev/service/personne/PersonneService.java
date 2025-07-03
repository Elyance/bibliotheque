package biblio.dev.service.personne;

import biblio.dev.entity.personne.Personne;
import biblio.dev.repository.personne.PersonneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {

    @Autowired
    private PersonneRepo personneRepo;

    public List<Personne> findAll() {
        return personneRepo.findAll();
    }

    public Personne findById(Integer id) {
        Optional<Personne> personne = personneRepo.findById(id);
        return personne.orElse(null);
    }

    public Personne save(Personne personne) {
        return personneRepo.save(personne);
    }

    public void deleteById(Integer id) {
        personneRepo.deleteById(id);
    }

    
}
