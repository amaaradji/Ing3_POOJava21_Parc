/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parc;

/**
 *
 * @author amaaradji
 */
public class PasseTickets extends Passe {
    int tickets;

    public PasseTickets(int num, String proprio) {
        super(num, proprio);
    }

    public int getTickets() {
        return tickets;
    }
    
    @Override
    void charger(int nb){
        tickets = nb;
    }
    
    @Override
    boolean valider(Operation op){
        if (tickets > 0){
            tickets--;
            histo.add(op);
            return true;
        }
        else 
            return false;
    }
}
