package gennadziy.dao;

import gennadziy.model.Adress;
import gennadziy.model.Klient;

import java.util.List;

public interface AdressDAO {
    List<Adress> allAdress();
    void add(Adress adress);
    void edit(Adress adress);
    void delete(Adress adress);
    Adress getById(int id);
}


