package fr.cesi.annuaire.bo;

public class Service {
    private int idService;
    private String nom;
    private String abv;

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }

    public Service(int idService, String nom, String abv) {
        this.idService = idService;
        this.nom = nom;
        this.abv = abv;
    }

    public Service(String nom, String abv) {
        this.nom = nom;
        this.abv = abv;
    }

}
