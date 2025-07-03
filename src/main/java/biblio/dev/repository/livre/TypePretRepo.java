package biblio.dev.repository.livre;

import biblio.dev.entity.livre.TypePret;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypePretRepo extends JpaRepository<TypePret, Integer> {
}
