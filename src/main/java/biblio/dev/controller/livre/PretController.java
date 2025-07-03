package biblio.dev.controller.livre;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import biblio.dev.entity.livre.Exemplaire;
import biblio.dev.entity.livre.Pret;
import biblio.dev.entity.livre.TypePret;
import biblio.dev.entity.personne.Adherant;
import biblio.dev.service.livre.ExemplaireService;
import biblio.dev.service.livre.PretService;
import biblio.dev.service.livre.TypePretService;
import jakarta.servlet.http.HttpServletRequest;
import biblio.dev.service.personne.AdherantService;

@Controller
public class PretController {
    @Autowired
    private PretService pretService;
    @Autowired
    private AdherantService adherantService;
    @Autowired
    private ExemplaireService exemplaireService;
    @Autowired
    private TypePretService typePretService;
    
    @GetMapping("/pret")
    public String formulairePret(Model model) {
        model.addAttribute("adherants", adherantService.findAll());
        model.addAttribute("exemplaires", exemplaireService.findAll());
        model.addAttribute("typePrets", typePretService.findAll());
        return "form-pret";
    }

    @GetMapping("/ajouterPret")
    public String ajouterPret(HttpServletRequest request,Model model) {
        Adherant adherant = adherantService.findById(Integer.parseInt(request.getParameter("idAdherant")));
        if (adherant == null) {
            model.addAttribute("erreurInsertion", "Adhérent non trouvé");
            return "form-pret";
        }
        Exemplaire exemplaire = exemplaireService.findById(Integer.parseInt(request.getParameter("idExemplaire")));
        if (exemplaire == null) {
            model.addAttribute("erreurInsertion", "Exemplaire non trouvé");
            return "form-pret";
        }
        TypePret typePret = typePretService.findById(Integer.parseInt(request.getParameter("idTypePret")));
        if (typePret == null) {
            model.addAttribute("erreurInsertion", "Type de prêt non trouvé");
            return "form-pret";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        LocalDateTime dateDebut = LocalDateTime.parse(request.getParameter("dateDebut"), formatter);
        LocalDateTime dateFin = LocalDateTime.parse(request.getParameter("dateFin"), formatter);
        Pret pret = new Pret();
        pret.setAdherant(adherant);
        pret.setExemplaire(exemplaire);
        pret.setTypePret(typePret);
        pret.setDateDebut(dateDebut);
        pret.setDateFin(dateFin);
        if (pretService.save(pret) == null) {
            model.addAttribute("erreurInsertion", "Erreur lors de l'insertion du prêt");
        } else {
            model.addAttribute("successInsertion", "Prêt ajouté avec succès");
        }
        return "form-pret";
    }
}
