/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parc;

/**
 *
 * @author amaaradji
 */
public class PasseZone extends Passe {
    boolean zone_1, zone_2;
    boolean activ;

    public PasseZone(int num, String proprio) {
        super(num, proprio);
    }
    
    @Override
    void charger(boolean zone_1, boolean zone_2){
        activ = true;
        this.zone_1 = zone_1;
        this.zone_2 = zone_2;
    }
    
    @Override
    boolean valider(Operation op){
        if ((op.zone == 1 && zone_1) || (op.zone == 2 && zone_2)){ //verifier si la zone du manège correspond à une zone ouverte dans le passe 
            histo.add(op);
            return true;
        }
        else 
            return false;
    }
    
}
