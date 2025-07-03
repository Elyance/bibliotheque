package biblio.dev.entity.livre;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "TypePret")
public class TypePret {

    @Id
    @Column(name = "idTypePret")
    private Integer idTypePret;

    @Column(name = "nomType", length = 50, nullable = false)
    private String nomType;

    public TypePret() {}

    public TypePret(Integer idTypePret, String nomType) {
        this.idTypePret = idTypePret;
        this.nomType = nomType;
    }

    public Integer getIdTypePret() {
        return idTypePret;
    }

    public void setIdTypePret(Integer idTypePret) {
        this.idTypePret = idTypePret;
    }

    public String getNomType() {
        return nomType;
    }

    public void setNomType(String nomType) {
        this.nomType = nomType;
    }
}
