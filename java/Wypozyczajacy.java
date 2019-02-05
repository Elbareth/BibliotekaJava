/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bibliotekajava;

import java.util.TimeZone;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service("Wypozyczajcy")
public class Wypozyczajacy {
    
    @Autowired
    @Value("Bartek")
    private String imie; // by to dzialalo musi byc konstruktor bezargumentowy
    @Autowired
    @Value("Taki")
    private String nazwisko;  
    @Autowired
    @Resource(name="Ksiazka")
    private Ksiazka ksiazka;  
    @Autowired
    @Value("T(java.util.TimeZone).LONG") // W taki sposob dodajemy stale
    private String tmp;   
    
    public Wypozyczajacy(){}

    public Wypozyczajacy(String imie, String nazwisko, Ksiazka ksiazka, String tmp) { // niezwraca uwagi na to co jest w konstruktorze
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ksiazka = ksiazka;
        this.tmp = tmp;        
    }
    public String wypozyczKsiazke(Ksiazka ksiazka){
        if(ksiazka.isDostepnosc()){
            ksiazka.setDostepnosc(false);
            this.ksiazka = ksiazka;
            return "Wypozyczam ksiazke "+ksiazka.getTytul();
        }
        return ksiazka.getTytul()+" zostala juz wypozyczona";
    }
    public String zwroc(Ksiazka ksiazka){
        ksiazka.setDostepnosc(true);
        return "Zwrocono "+ksiazka.getTytul();
    }

    @Override
    public String toString() {
        return "Wypozyczajacy{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", ksiazka=" + ksiazka + '}'+" strefa czasowa " +TimeZone.getTimeZone(tmp).getDisplayName();
    }
}
