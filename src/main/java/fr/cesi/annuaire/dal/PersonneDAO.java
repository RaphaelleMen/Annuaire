package fr.cesi.annuaire.dal;

import fr.cesi.annuaire.bo.Personne;

import java.util.List;

public interface PersonneDAO {

    void insert (Personne personne);
    Personne selectById(int id);
    List<Personne> selectAll();
    void update(Personne personne);
    void delete(int id);
    List<Personne> selectByService(String service);
    List<Personne> selectBySite(String site);
    List<Personne> selectByMotCle(String motCle);
}
