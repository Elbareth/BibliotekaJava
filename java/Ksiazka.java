/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bibliotekajava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service("Ksiazka")
@PropertySource("${sciezka}") // podana w zwykly sposob
public class Ksiazka {
    @Value("${nazwa1}")
    private String tytul;
    @Value("${autor1}")
    private String autor;
    @Value("${dostepnosc1}")
    private boolean dostepnosc;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDostepnosc() {
        return dostepnosc;
    }

    public void setDostepnosc(boolean dostepnosc) {
        this.dostepnosc = dostepnosc;
    }

    @Override
    public String toString() {
        return "Ksiazka{" + "tytul=" + tytul + ", autor=" + autor + ", dostepnosc=" + dostepnosc + '}';
    }
}
