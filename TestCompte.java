/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.compte;

/**
 *
 * @author Muhammed Fode
 */
public class TestCompte {
    public static void main(String args[]){
        Compte compte1 = new CompteCourant(25142,"Compte Courant","KEITA","MUHAMMED",20000,500);
        Compte compte2 = new CompteEpargne(5147,"Compte Epargne","FALL","SOKHNA",151800,3,1000);
        
        System.out.println(compte1);
        System.out.println("-----------------------------------------");
        System.out.println(compte2);
    }
    
}
