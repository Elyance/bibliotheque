package biblio.dev.repository.livre;

import biblio.dev.entity.livre.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepo extends JpaRepository<Categorie, Integer> {
}
