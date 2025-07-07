package biblio.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import biblio.dev.service.personne.AdherantService;

@Controller
public class HelloWorld {
    @GetMapping("/")
    public String hello(Model model) {
        return "home";
    }
}