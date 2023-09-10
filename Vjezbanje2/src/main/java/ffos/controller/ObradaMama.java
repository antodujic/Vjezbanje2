/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.controller;

import ffos.model.Mama;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaMama extends Obrada<Mama> {

    public void setPodaci(String ime, String prezime, Date datum) {
        if (entitet == null) {
            entitet = new Mama();
        }
        entitet.setIme(ime);
        entitet.setPrezime(prezime);
        entitet.setDatum(datum);
    }

    @Override
    public void kontrolaCreate() throws Exception {

    }

    @Override
    public void kontrolaUpdate() throws Exception {

    }

    @Override
    public void kontrolaDelete() throws Exception {

    }

    @Override
    public List<Mama> read() {
        return session.createQuery("from Mama", Mama.class).list();
    }

    @Override
    public void setNew() {
        entitet = new Mama();
    }

}
