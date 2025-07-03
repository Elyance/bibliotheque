package biblio.dev.controller.personne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import biblio.dev.entity.personne.Admin;
import biblio.dev.service.personne.AdminService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/login-admin")
    public String formulaireLogin(Model model) {
        return "form-login";
    } 

    @PostMapping("/login-admin-check")
    public String login(HttpServletRequest request,HttpSession session,Model model) {
        String mail = request.getParameter("mail").toString();
        
        String password = request.getParameter("password").toString();
        
        Admin admin = adminService.checkAdminPassword(mail, password);
        if (admin != null) {
            session.setAttribute("admin", admin);
            return "admin-template"; // Redirect to admin dashboard or home page
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "form-login"; // Redirect back to login form with error
        }
    }

    
}
