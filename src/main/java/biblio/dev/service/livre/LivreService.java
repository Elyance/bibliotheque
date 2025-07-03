package biblio.dev.service.livre;

import biblio.dev.entity.livre.Livre;
import biblio.dev.repository.livre.LivreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreService {
    @Autowired
    private LivreRepo livreRepo;

    public List<Livre> findAll() {
        return livreRepo.findAll();
    }

    public Optional<Livre> findById(Integer id) {
        return livreRepo.findById(id);
    }

    public Livre save(Livre livre) {
        return livreRepo.save(livre);
    }

    public void deleteById(Integer id) {
        livreRepo.deleteById(id);
    }
}
