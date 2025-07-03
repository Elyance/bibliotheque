package biblio.dev.repository.livre;

import biblio.dev.entity.livre.Exemplaire;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExemplaireRepo extends JpaRepository<Exemplaire, Integer> {
    List<Exemplaire> findByNumero(String numero);
}
