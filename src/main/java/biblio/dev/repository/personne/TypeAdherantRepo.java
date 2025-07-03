package biblio.dev.repository.personne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblio.dev.entity.personne.TypeAdherant;

@Repository
public interface TypeAdherantRepo extends JpaRepository<TypeAdherant, Integer> {
    // Ajoute ici des méthodes personnalisées si besoin
    
}
