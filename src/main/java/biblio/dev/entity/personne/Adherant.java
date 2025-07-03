package biblio.dev.entity.personne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "Adherant")
public class Adherant {

    @Id
    @Column(name = "idAdherant")
    private Integer idAdherant;

    @ManyToOne
    @JoinColumn(name = "idPersonne", nullable = false, unique = true)
    private Personne personne;

    @ManyToOne
    @JoinColumn(name = "idTypeAdherant", nullable = false)
    private TypeAdherant typeAdherant;

    // Constructeurs
    public Adherant() {}

    public Adherant(Integer idAdherant, Personne personne, TypeAdherant typeAdherant) {
        this.idAdherant = idAdherant;
        this.personne = personne;
        this.typeAdherant = typeAdherant;
    }

    // Getters et Setters
    public Integer getIdAdherant() {
        return idAdherant;
    }

    public void setIdAdherant(Integer idAdherant) {
        this.idAdherant = idAdherant;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public TypeAdherant getTypeAdherant() {
        return typeAdherant;
    }

    public void setTypeAdherant(TypeAdherant typeAdherant) {
        this.typeAdherant = typeAdherant;
    }
}
