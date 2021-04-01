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
public class CompteCourant extends Compte {
    private int limiteSemaine;
    
    public CompteCourant(){}
    
    public CompteCourant(int numCompte, String typeCompte, String nomTitulaireCompte,String prenomTitulaireCompte, int solde,int limiteSemaine)
    {
        super(numCompte,typeCompte,nomTitulaireCompte,prenomTitulaireCompte,solde);
        this.limiteSemaine = limiteSemaine;
    }

    public int getLimiteSemaine() {
        return limiteSemaine;
    }

    public void setLimiteSemaine(int limiteSemaine) {
        this.limiteSemaine = limiteSemaine;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nLimite Retrait Semaine = " + limiteSemaine;
    }
    
    
}
