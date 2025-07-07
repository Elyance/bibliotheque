package biblio.dev.repository.personne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblio.dev.entity.personne.Adherant;

@Repository
public interface AdherantRepo extends JpaRepository<Adherant, Integer> {
    // Ajoute ici des méthodes personnalisées si besoin
    Adherant findByPersonne_MailAndPersonne_Password(String mail, String password);
}
