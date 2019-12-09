package gennadziy.service;

import gennadziy.model.Klient;

import java.util.List;

public interface KlientService {
    List<Klient> allKlients();
    void add(Klient klient);
    void edit(Klient klient);
    void delete(Klient klient);
    Klient getById(int id);
}
