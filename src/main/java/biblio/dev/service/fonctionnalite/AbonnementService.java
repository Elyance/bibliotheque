package biblio.dev.service.fonctionnalite;

import biblio.dev.entity.fonctionnalite.Abonnement;
import biblio.dev.repository.fonctionnalite.AbonnementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbonnementService {
    @Autowired
    private AbonnementRepo abonnementRepo;

    public List<Abonnement> findAll() {
        return abonnementRepo.findAll();
    }

    public Abonnement findById(Integer id) {
        return abonnementRepo.findById(id).orElse(null);
    }

    public Abonnement save(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    public void deleteById(Integer id) {
        abonnementRepo.deleteById(id);
    }
}
