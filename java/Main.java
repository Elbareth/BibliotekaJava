/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bibliotekajava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String [] args){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Konfiguracja.class);
        context.registerShutdownHook();
        System.out.println(context.getBean("Ksiazka"));
        System.out.println(context.getBean("Wypozyczajacy"));
    }
}
