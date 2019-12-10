package gennadziy.dao;

import gennadziy.model.Klient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.concurrent.atomic.AtomicInteger;
@Repository
public class KlientDAOImpl implements KlientDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Klient> allKlients() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Klient").list();
    }

    @Override
    public void add(Klient klient) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(klient);
    }

    @Override
    public void delete(Klient klient) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(klient);
    }

    @Override
    public void edit(Klient klient) {
        Session session = sessionFactory.getCurrentSession();
        session.update(klient);
    }

    @Override
    public Klient getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Klient.class, id);
    }
}