/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ffos.controller;

import ffos.model.Dijete;
import ffos.model.Mama;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ObradaDijete extends Obrada<Dijete>{

    public void setPodaci(String ime, String prezime, Mama mama) {
        if (entitet == null) {
            entitet = new Dijete();
        }
        entitet.setIme(ime);
        entitet.setPrezime(prezime);
        entitet.setMama(mama);
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
    public List<Dijete> read() {
        return session.createQuery("from Dijete", Dijete.class).list();
    }

    @Override
    public void setNew() {
        entitet = new Dijete();
    }

}
