package biblio.dev.entity.livre;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "Categorie")
public class Categorie {

    @Id
    @Column(name = "idCategorie")
    private Integer idCategorie;

    @Column(name = "nomCategorie", length = 50, nullable = false)
    private String nomCategorie;

    @ManyToMany
    @JoinTable(name = "Livre_Categorie",
               joinColumns = @JoinColumn(name = "idCategorie"),
               inverseJoinColumns = @JoinColumn(name = "idLivre"))
    private List<Livre> livres;


    public Categorie() {}

    public Categorie(Integer idCategorie, String nomCategorie) {
        this.idCategorie = idCategorie;
        this.nomCategorie = nomCategorie;
    }

    public Integer getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
}
