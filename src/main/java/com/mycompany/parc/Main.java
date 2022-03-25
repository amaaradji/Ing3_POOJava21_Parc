/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.parc;

import java.util.Scanner;

/**
 *
 * @author amaaradji
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Création Passe-----------");
        System.out.println("Entrer numéro Passe : ");
        int num = sc.nextInt();
        System.out.println("Entrer type Passe Zone ou Tickets (z/t) : ");
        String type = sc.next();
        System.out.println("Entrer nom proprio : ");
        String proprio = sc.next();
        System.out.println(type + " " + proprio);
        Passe p;
        if (type.equals("z")){
            
            p = new PasseZone(num, proprio);
        }
        else 
            p = new PasseTickets(num, proprio);
        
        System.out.println("--Rechargement Passe-----------");
        if (type.equals("z")) {
            System.out.println("ouvrir zone 1 (o/n)? ");
            boolean a = sc.next().equals("o");
            System.out.println("ouvrir zone 2 (o/n)? ");
            boolean b = sc.next().equals("o");
            p.charger(a,b);
        }
        else {
            System.out.println("Entrer Nb tickets : ");
            int nb = sc.nextInt();
            p.charger(nb);
        }
        
        System.out.println("--Tester Validation d'Opération-----------");
        
        System.out.println("Entrer le numéro de la zone du manège : ");
        int zone = sc.nextInt();
        
        Operation op = new Operation("23/03/2022 11:00", zone);
        boolean validation= p.valider(op);
        if (validation)
            System.out.println(op + " - operation validée");
        else 
            System.out.println(op + " - operation non-validée");
        
        System.out.println("--Historique :-----------");
        p.historique(3);
        
            
    }
    
}
