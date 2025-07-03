package biblio.dev.service.livre;

import biblio.dev.entity.livre.Exemplaire;
import biblio.dev.repository.livre.ExemplaireRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExemplaireService {
    @Autowired
    private ExemplaireRepo exemplaireRepo;

    public List<Exemplaire> findAll() {
        return exemplaireRepo.findAll();
    }

    public Exemplaire findById(Integer id) {
        return exemplaireRepo.findById(id).orElse(null);
    }

    public Exemplaire save(Exemplaire exemplaire) {
        return exemplaireRepo.save(exemplaire);
    }

    public void deleteById(Integer id) {
        exemplaireRepo.deleteById(id);
    }
    public List<Exemplaire> findByNumero(String numero) {
        return exemplaireRepo.findByNumero(numero);
    }
}
