package biblio.dev.entity.personne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    @Column(name = "idAdmin")
    private Integer idAdmin;

    @OneToOne
    @JoinColumn(name = "idPersonne", nullable = false)
    private Personne personne;

    // Constructeurs
    public Admin() {}

    public Admin(Integer idAdmin, Personne personne) {
        this.idAdmin = idAdmin;
        this.personne = personne;
    }

    // Getters et Setters
    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
}
