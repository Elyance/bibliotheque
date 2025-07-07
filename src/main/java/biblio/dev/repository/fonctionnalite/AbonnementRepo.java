package biblio.dev.repository.fonctionnalite;

import biblio.dev.entity.fonctionnalite.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbonnementRepo extends JpaRepository<Abonnement, Integer> {
}
