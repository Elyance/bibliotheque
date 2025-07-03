package biblio.dev.entity.personne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "TypeAdherant")
public class TypeAdherant {

    @Id
    @Column(name = "idTypeAdherant", length = 55)
    private String idTypeAdherant;

    @Column(name = "nomTypeAdherant", length = 50, nullable = false)
    private String nomTypeAdherant;

    // Constructeurs
    public TypeAdherant() {}

    public TypeAdherant(String idTypeAdherant, String nomTypeAdherant) {
        this.idTypeAdherant = idTypeAdherant;
        this.nomTypeAdherant = nomTypeAdherant;
    }

    // Getters et Setters
    public String getIdTypeAdherant() {
        return idTypeAdherant;
    }

    public void setIdTypeAdherant(String idTypeAdherant) {
        this.idTypeAdherant = idTypeAdherant;
    }

    public String getNomTypeAdherant() {
        return nomTypeAdherant;
    }

    public void setNomTypeAdherant(String nomTypeAdherant) {
        this.nomTypeAdherant = nomTypeAdherant;
    }
}
