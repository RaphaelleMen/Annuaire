package fr.cesi.annuaire.ihm;

import javax.swing.*;

public class AnnuaireApp {

    private static AnnuaireApp instance;

    public static AnnuaireApp getInstance() {
        if (instance == null) {
            instance = new AnnuaireApp();
        }
        return instance;
    }

    private AnnuaireApp(){}

    //initialise les valeurs affichées au lancement de l'app
    //private int position = 0;

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //EcranPersonne ecranPersonne = new EcranPersonne();
                EcranAnnuaire ecranAnnuaire = new EcranAnnuaire();
                //EcranSite ecranSite = new EcranSite();
                //EcranService ecranService = new EcranService();
            }
        });

    }

}
