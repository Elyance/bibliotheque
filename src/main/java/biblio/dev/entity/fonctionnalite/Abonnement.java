package biblio.dev.entity.fonctionnalite;

import jakarta.persistence.*;
import java.sql.Date;
import biblio.dev.entity.personne.Adherant;

@Entity
@Table(name = "Abonnement")
public class Abonnement {

    @Id
    @Column(name = "idAbonnement")
    private Integer idAbonnement;

    @Column(name = "dateDebut", nullable = false)
    private Date dateDebut;

    @Column(name = "dateFin", nullable = false)
    private Date dateFin;

    @ManyToOne
    @JoinColumn(name = "idAdherant", nullable = false)
    private Adherant adherant;

    public Abonnement() {}

    public Abonnement(Integer idAbonnement, Date dateDebut, Date dateFin, Adherant adherant) {
        this.idAbonnement = idAbonnement;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.adherant = adherant;
    }

    public Integer getIdAbonnement() {
        return idAbonnement;
    }

    public void setIdAbonnement(Integer idAbonnement) {
        this.idAbonnement = idAbonnement;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Adherant getAdherant() {
        return adherant;
    }

    public void setAdherant(Adherant adherant) {
        this.adherant = adherant;
    }
}
