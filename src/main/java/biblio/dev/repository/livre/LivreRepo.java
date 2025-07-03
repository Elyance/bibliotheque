package biblio.dev.repository.livre;

import biblio.dev.entity.livre.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepo extends JpaRepository<Livre, Integer> {
}
