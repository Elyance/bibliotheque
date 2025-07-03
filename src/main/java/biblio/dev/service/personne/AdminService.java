package biblio.dev.service.personne;

import biblio.dev.entity.personne.Admin;
import biblio.dev.repository.personne.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminRepo;

    public List<Admin> findAll() {
        return adminRepo.findAll();
    }

    public Admin findById(Integer id) {
        Optional<Admin> admin = adminRepo.findById(id);
        return admin.orElse(null);
    }

    public Admin save(Admin admin) {
        return adminRepo.save(admin);
    }

    public void deleteById(Integer id) {
        adminRepo.deleteById(id);
    }

    public Admin checkAdminPassword(String mail, String password) {
        Admin admin = adminRepo.findByPersonne_Mail(mail);
        if (admin != null && admin.getPersonne().getPassword().equals(password)) {
            return admin;
        }
        return null;
    }
}
