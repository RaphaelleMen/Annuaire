package fr.cesi.annuaire.bo;

public class Site {
    private int idSite;
    private String nom;
    private String role;

    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public String getNom() {
        return nom;
    }

    public String getRole() {
        return role;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Site(String nom) {
        this.nom = nom;
    }
}

