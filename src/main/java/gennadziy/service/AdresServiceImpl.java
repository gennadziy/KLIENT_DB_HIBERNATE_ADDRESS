package gennadziy.service;

import gennadziy.dao.AdressDAO;
import gennadziy.model.Adress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AdresServiceImpl implements AdressService {
    private AdressDAO adressDAO;

    @Autowired

    public void setAdressDAO ( AdressDAO adressDAO ) {
        this.adressDAO = adressDAO;
    }

    @Override
    @Transactional
    public List<Adress> allAdress () {
        return adressDAO.allAdress ();
    }

    @Override
    @Transactional
    public void add ( Adress adress ) {
                adressDAO.add ( adress );
    }

    @Override
    @Transactional
    public void edit ( Adress adress ) {
        adressDAO.edit ( adress );
    }

    @Override
    @Transactional
    public void delete ( Adress adress ) {
adressDAO.delete ( adress );
    }

    @Override
    @Transactional
    public Adress getById ( int id ) {
        return adressDAO.getById ( id );
    }
}
