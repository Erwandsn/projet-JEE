package bo;

import java.util.Date;

public class Sortie {
    private int id;
    private String nom;
    private Date dateheureDebut;
    private int durée;
    private Date dateLimiteInscription;
    private int nbInscriptionsMax;
    private String infosSortie;
    private Etat etat;


    public Sortie( String nom, Date dateheureDebut, int durée, Date dateLimiteInscription, int nbInscriptionsMax, String infosSortie, Etat etat) {
        this.nom = nom;
        this.dateheureDebut = dateheureDebut;
        this.durée = durée;
        this.dateLimiteInscription = dateLimiteInscription;
        this.nbInscriptionsMax = nbInscriptionsMax;
        this.infosSortie = infosSortie;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Date getDateheureDebut() {
        return dateheureDebut;
    }

    public int getDurée() {
        return durée;
    }

    public Date getDateLimiteInscription() {
        return dateLimiteInscription;
    }

    public int getNbInscriptionsMax() {
        return nbInscriptionsMax;
    }

    public String getInfosSortie() {
        return infosSortie;
    }

    public Etat getEtat() {
        return etat;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateheureDebut(Date dateheureDebut) {
        this.dateheureDebut = dateheureDebut;
    }

    public void setDurée(int durée) {
        this.durée = durée;
    }

    public void setDateLimiteInscription(Date dateLimiteInscription) {
        this.dateLimiteInscription = dateLimiteInscription;
    }

    public void setNbInscriptionsMax(int nbInscriptionsMax) {
        this.nbInscriptionsMax = nbInscriptionsMax;
    }

    public void setInfosSortie(String infosSortie) {
        this.infosSortie = infosSortie;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
