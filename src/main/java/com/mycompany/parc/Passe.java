/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parc;

import java.util.ArrayList;

/**
 *
 * @author amaaradji
 */
public abstract class Passe {
    int num;
    String proprio;
    ArrayList<Operation> histo;

    public Passe(int num, String proprio) {
        this.num = num;
        this.proprio = proprio;
        this.histo = new ArrayList<>();
    }

    public ArrayList<Operation> getHisto() {
        return histo;
    }
    
    void historique(int nombreOperations){
        for (int i = histo.size()-1 ; i >= 0 &&  i >= (histo.size() - nombreOperations); i--) //afficher, en ordre inverse, le min entre nombreOperations et histo.size()
            System.out.println(histo.get(i));
    }
    
    void charger(boolean zone_1, boolean zone_2){};
    void charger(int nb){};
    
    abstract boolean valider(Operation op);
    


}
