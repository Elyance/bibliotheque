package biblio.dev.service.livre;

import biblio.dev.entity.livre.Pret;
import biblio.dev.repository.livre.PretRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PretService {
    @Autowired
    private PretRepo pretRepo;

    public List<Pret> findAll() {
        return pretRepo.findAll();
    }

    public Optional<Pret> findById(Integer id) {
        return pretRepo.findById(id);
    }

    public Pret save(Pret pret) {
        return pretRepo.save(pret);
    }

    public void deleteById(Integer id) {
        pretRepo.deleteById(id);
    }
}
