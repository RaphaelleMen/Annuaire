package fr.cesi.annuaire.dal;

import fr.cesi.annuaire.dal.jdbc.PersonneDAOJdbcImpl;

public class DAOFactory {

    // Why le cast (PersonneDAO) ?
    public static PersonneDAO getPersonneDAO(){return (PersonneDAO) new PersonneDAOJdbcImpl();
    }
}
