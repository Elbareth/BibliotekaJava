/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bibliotekajava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author lenovo
 */
@Configuration
@ComponentScan("com.mycompany.bibliotekajava")
public class Konfiguracja {
    @Bean("Ksiazka")
    public Ksiazka ksiazka(){
        return new Ksiazka();
    }
    @Bean("Wypozyczajacy")
    public Wypozyczajacy wypozyczajacy(){
        Wypozyczajacy wypozyczajcy = new Wypozyczajacy();
        return wypozyczajcy;
    }
}
