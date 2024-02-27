package fr.cesi.annuaire.bo;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private String num_port;
    private String num_fixe;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNum_port() {
        return num_port;
    }

    public void setNum_port(String num_port) {
        this.num_port = num_port;
    }

    public String getNum_fixe() {
        return num_fixe;
    }

    public void setNum_fixe(String num_fixe) {
        this.num_fixe = num_fixe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Personne(int id, String nom, String prenom, String num_port, String num_fixe, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.num_port = num_port;
        this.num_fixe = num_fixe;
        this.email = email;
    }

    public Personne(String nom, String prenom, String num_port, String num_fixe, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.num_port = num_port;
        this.num_fixe = num_fixe;
        this.email = email;
    }

}
