package fr.cesi.annuaire.dal.jdbc;

import fr.cesi.annuaire.bo.Personne;

import java.sql.PreparedStatement;
import java.util.List;

public class PersonneDAOJdbcImpl {
    // Gestion de l'API à faire ici

    @Override
    void insert (Personne personne){

  //     //Etablissement co api POST
  //     // Préparation données à envoyer
  //     PreparedStatement pStmt;
  //     pStmt.setString(1, personne.getNom());
  //     pStmt.setString(2, personne.getPrenom());
  //     pStmt.setString(3, personne.getNum_fixe());
  //     pStmt.setString(4, personne.getNum_port());
  //     pStmt.setString(5, personne.getEmail());
  //     // POST
  //     // Récupération id
  //     // set personne
   };

   Personne selectById(int id);
   List<Personne> selectAll();
   void update(Personne personne);
   void delete(int id);
   List<Personne> selectByService(String service);
   List<Personne> selectBySite(String site);
   List<Personne> selectByMotCle(String motCle);
}
