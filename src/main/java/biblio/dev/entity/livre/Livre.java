package biblio.dev.entity.livre;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
@Table(name = "Livre")
public class Livre {

    @Id
    @Column(name = "idLivre")
    private Integer idLivre;

    @Column(name = "titre", length = 50, nullable = false)
    private String titre;

    @Column(name = "ISBN", length = 50, nullable = false)
    private String ISBN;

    @Column(name = "Edition", length = 50, nullable = false)
    private String edition;

    @Column(name = "Auteur", length = 50, nullable = false)
    private String auteur;

    @Column(name = "ageLimite", nullable = false)
    private Integer ageLimite;

    // Association avec Categorie
    // Assuming a many-to-many relationship with Categorie
    // This would typically be handled with a join table in a real application
    @ManyToMany
    @JoinTable(name = "Livre_Categorie",
               joinColumns = @JoinColumn(name = "idLivre"),
               inverseJoinColumns = @JoinColumn(name = "idCategorie"))
    private List<Categorie> categories;

    public Livre() {}

    public Livre(Integer idLivre, String titre, String ISBN, String edition, String auteur, Integer ageLimite) {
        this.idLivre = idLivre;
        this.titre = titre;
        this.ISBN = ISBN;
        this.edition = edition;
        this.auteur = auteur;
        this.ageLimite = ageLimite;
    }

    public Integer getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(Integer idLivre) {
        this.idLivre = idLivre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Integer getAgeLimite() {
        return ageLimite;
    }

    public void setAgeLimite(Integer ageLimite) {
        this.ageLimite = ageLimite;
    }
    public List<Categorie> getCategories() {
        return categories;
    }
    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }
}
