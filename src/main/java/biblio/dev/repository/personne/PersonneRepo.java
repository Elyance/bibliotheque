package biblio.dev.repository.personne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblio.dev.entity.personne.Personne;

@Repository
public interface PersonneRepo extends JpaRepository<Personne, Integer> {
    // Ajoute ici des méthodes personnalisées si besoin
}
