package biblio.dev.entity.personne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "Personne")
public class Personne {

    @Id
    @Column(name = "idPersonne")
    private Integer idPersonne;

    @Column(name = "nom", length = 50)
    private String nom;

    @Column(name = "adresse", length = 50)
    private String adresse;

    @Column(name = "mail", length = 50, nullable = false)
    private String mail;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "dateNaissance", nullable = false)
    private java.sql.Date dateNaissance;

    // Constructeurs
    public Personne() {}

    public Personne(Integer idPersonne, String nom, java.sql.Date dateNaissance, String adresse, String mail, String password) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.mail = mail;
        this.password = password;
    }

    // Getters et Setters
    public Integer getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Integer idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public java.sql.Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(java.sql.Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
