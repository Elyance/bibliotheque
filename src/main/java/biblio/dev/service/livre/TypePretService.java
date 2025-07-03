package biblio.dev.service.livre;

import biblio.dev.entity.livre.TypePret;
import biblio.dev.repository.livre.TypePretRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePretService {
    @Autowired
    private TypePretRepo typePretRepo;

    public List<TypePret> findAll() {
        return typePretRepo.findAll();
    }

    public TypePret findById(Integer id) {
        return typePretRepo.findById(id).orElse(null);
    }

    public TypePret save(TypePret typePret) {
        return typePretRepo.save(typePret);
    }

    public void deleteById(Integer id) {
        typePretRepo.deleteById(id);
    }
}
