package biblio.dev.service.livre;

import biblio.dev.entity.livre.Categorie;
import biblio.dev.repository.livre.CategorieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepo categorieRepo;

    public List<Categorie> findAll() {
        return categorieRepo.findAll();
    }

    public Optional<Categorie> findById(Integer id) {
        return categorieRepo.findById(id);
    }

    public Categorie save(Categorie categorie) {
        return categorieRepo.save(categorie);
    }

    public void deleteById(Integer id) {
        categorieRepo.deleteById(id);
    }
}
