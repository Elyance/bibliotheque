package biblio.dev.entity.livre;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "Exemplaire")
public class Exemplaire {

    @Id
    @Column(name = "idExemplaire")
    private Integer idExemplaire;

    @Column(name = "numero", length = 50, nullable = false)
    private String numero;

    @ManyToOne
    @JoinColumn(name = "idLivre", nullable = false)
    private Livre livre;

    public Exemplaire() {}

    public Exemplaire(Integer idExemplaire, String numero, Livre livre) {
        this.idExemplaire = idExemplaire;
        this.numero = numero;
        this.livre = livre;
    }

    public Integer getIdExemplaire() {
        return idExemplaire;
    }

    public void setIdExemplaire(Integer idExemplaire) {
        this.idExemplaire = idExemplaire;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }
}
