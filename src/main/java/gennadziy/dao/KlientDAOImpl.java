package gennadziy.dao;

import gennadziy.model.Klient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.concurrent.atomic.AtomicInteger;
@Repository
public class KlientDAOImpl implements KlientDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Klient> klients = new HashMap<> ();

    static {
        Klient klient1 = new Klient();
        klient1.setId(AUTO_ID.getAndIncrement());
        klient1.setName("In654ption");
        klient1.setYear(2010);
        klient1.setPlec("sci-fi");
        klient1.setBlocked(true);
        klients.put(klient1.getId(), klient1);
        Klient klient2 = new Klient();
        klient2.setId(AUTO_ID.getAndIncrement());
        klient2.setName("Inception");
        klient2.setYear(2015);
        klient2.setPlec("sci-fi");
        klient2.setBlocked(true);
        klients.put(klient2.getId(), klient2);

    }
    @Override
    public List<Klient> allKlients () {
        return new ArrayList<> (klients.values());
    }

    @Override
    public void add ( Klient klient ) {
        klient.setId(AUTO_ID.getAndIncrement());
        klients.put(klient.getId(), klient);
    }

    @Override
    public void edit ( Klient klient ) {
        klients.put(klient.getId(), klient);
    }

    @Override
    public void delete ( Klient klient ) {
        klients.remove(klient.getId());
    }

    @Override
    public Klient getById ( int id ) {
        return klients.get(id);
    }
}
