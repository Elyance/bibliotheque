package biblio.dev.repository.personne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblio.dev.entity.personne.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {
    // Ajoute ici des méthodes personnalisées si besoin
    Admin findByPersonne_Mail(String mail);
}
