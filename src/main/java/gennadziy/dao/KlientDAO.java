package gennadziy.dao;

import gennadziy.model.Klient;

import java.util.List;

public interface KlientDAO {
    List<Klient> allKlients();
    void add(Klient klient);
    void edit(Klient klient);
    void delete(Klient klient);
    Klient getById(int id);
}
