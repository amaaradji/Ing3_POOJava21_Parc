/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parc;

/**
 *
 * @author amaaradji
 */
public class Operation {
    String date;
    int zone;

    public Operation(String date, int dapart) {
        this.date = date;
        this.zone = dapart;
    }

    public int getDapart() {
        return zone;
    }

    @Override
    public String toString() {
        return "passage manège en zone " + zone + " le " + date  ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
