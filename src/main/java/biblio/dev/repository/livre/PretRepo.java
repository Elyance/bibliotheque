package biblio.dev.repository.livre;

import biblio.dev.entity.livre.Pret;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PretRepo extends JpaRepository<Pret, Integer> {
}
