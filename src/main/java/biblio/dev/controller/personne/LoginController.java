package biblio.dev.controller.personne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import biblio.dev.entity.personne.Admin;
import biblio.dev.entity.personne.Adherant;
import biblio.dev.service.personne.AdminService;
import biblio.dev.service.personne.AdherantService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private AdherantService adherantService;


    @GetMapping("/login-admin")
    public String formulaireLoginAdmin(Model model) {
        return "form-login";
    } 

    @GetMapping("/login-adherant")
    public String formulaireLoginAdherant(Model model) {
        return "form-login";
    } 

    @PostMapping("/login-check")
    public String login(HttpServletRequest request, HttpSession session, Model model) {
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");
        Admin admin = adminService.checkAdminPassword(mail, password);
        if (admin != null) {
            session.setAttribute("admin", admin);
            return "admin-template";
        } else {
            Adherant adherant = adherantService.login(mail, password);
            if (adherant != null) {
                session.setAttribute("adherant", adherant);
                return "adherant-template";
            } else {
                model.addAttribute("error", "Invalid email or password");
                return "form-login";
            }
        }
    }

    
}
