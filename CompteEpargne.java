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

public class CompteEpargne extends Compte {
    private int tauxInteret;
    private int montantPrime;
    
    public CompteEpargne(){}
    
    public CompteEpargne(int numCompte, String typeCompte, String nomTitulaireCompte,String prenomTitulaireCompte, int solde,int tauxInteret,int montantPrime)
    {
        super(numCompte,typeCompte,nomTitulaireCompte,prenomTitulaireCompte,solde);
        this.tauxInteret = tauxInteret;
        this.montantPrime = montantPrime;
    }

    public int getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(int tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public int getMontantPrime() {
        return montantPrime;
    }

    public void setMontantPrime(int montantPrime) {
        this.montantPrime = montantPrime;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaux Interet = " + tauxInteret + "%" + " \nMontant Prime = " + montantPrime;
    }
    
    
}
