package gennadziy.dao;

import gennadziy.model.Adress;
import gennadziy.model.Klient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class AdressDAOImpl implements AdressDAO {
    private SessionFactory sessionFactory;


    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Adress> allAdress () {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Adress").list();
    }

    @Override
    public void add ( Adress adress ) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(adress);
    }

    @Override
    public void edit ( Adress adress ) {
        Session session = sessionFactory.getCurrentSession();
        session.update (adress);
    }

    @Override
    public void delete ( Adress adress ) {
        Session session = sessionFactory.getCurrentSession();
        session.delete (adress);
    }

    @Override
    public Adress getById( int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Adress.class, id);
    }
}
