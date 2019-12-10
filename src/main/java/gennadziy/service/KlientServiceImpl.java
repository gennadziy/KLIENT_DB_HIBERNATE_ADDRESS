package gennadziy.service;

import gennadziy.dao.KlientDAO;
import gennadziy.dao.KlientDAOImpl;
import gennadziy.model.Klient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class KlientServiceImpl implements KlientService {
    private KlientDAO klientDAO;
    @Autowired
    public void setKlientDAO ( KlientDAO klientDAO ) {
        this.klientDAO = klientDAO;
    }

    @Override
    @Transactional
    public List<Klient> allKlients () {
        return klientDAO.allKlients();
    }

    @Override
    @Transactional
    public void add ( Klient klient ) {
        klientDAO.add(klient);
    }

    @Override
    @Transactional
    public void edit ( Klient klient ) {
        klientDAO.edit(klient);
    }

    @Override
    @Transactional
    public void delete ( Klient klient ) {
        klientDAO.delete(klient);
    }

    @Override
    @Transactional
    public Klient getById ( int id ) {
        return klientDAO.getById(id);
    }
}
