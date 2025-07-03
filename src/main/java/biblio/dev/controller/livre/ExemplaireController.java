package biblio.dev.controller.livre;

import org.springframework.web.bind.annotation.ResponseBody;

import biblio.dev.entity.livre.Exemplaire;
import biblio.dev.service.livre.ExemplaireService;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ExemplaireController {
    @Autowired
    private ExemplaireService exemplaireService;

    @GetMapping("/api/exemplaires/suggest")
    @ResponseBody
    public List<Exemplaire> suggestExemplaires(@RequestParam String numero) {
        return exemplaireService.findByNumero(numero);
    }
}
