package biblio.dev.entity.livre;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import biblio.dev.entity.personne.Adherant;
import biblio.dev.entity.personne.Admin;

@Entity
@Table(name = "Pret")
public class Pret {

    @Id
    @Column(name = "idPret")
    private Integer idPret;

    @Column(name = "dateDebut", nullable = false)
    private Timestamp dateDebut;

    @Column(name = "dateFin", nullable = false)
    private Timestamp dateFin;

    @ManyToOne
    @JoinColumn(name = "idTypePret", nullable = false)
    private TypePret typePret;

    @ManyToOne
    @JoinColumn(name = "idAdmin", nullable = false)
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "idAdherant", nullable = false)
    private Adherant adherant;

    @ManyToOne
    @JoinColumn(name = "idExemplaire", nullable = false)
    private Exemplaire exemplaire;

    public Pret() {}

    public Pret(Integer idPret, LocalDateTime dateDebut, LocalDateTime dateFin, TypePret typePret, Admin admin, Adherant adherant, Exemplaire exemplaire) {
        this.idPret = idPret;
        this.setDateDebut(dateDebut);
        this.setDateFin(dateFin);
        this.typePret = typePret;
        this.admin = admin;
        this.adherant = adherant;
        this.exemplaire = exemplaire;
    }

    public Integer getIdPret() {
        return idPret;
    }

    public void setIdPret(Integer idPret) {
        this.idPret = idPret;
    }

    public Timestamp getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        Timestamp ts = Timestamp.valueOf(dateDebut);
        this.dateDebut = ts;
    }

    public Timestamp getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        Timestamp ts = Timestamp.valueOf(dateFin);
        this.dateFin = ts;
    }

    public TypePret getTypePret() {
        return typePret;
    }

    public void setTypePret(TypePret typePret) {
        this.typePret = typePret;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Adherant getAdherant() {
        return adherant;
    }

    public void setAdherant(Adherant adherant) {
        this.adherant = adherant;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }
}
