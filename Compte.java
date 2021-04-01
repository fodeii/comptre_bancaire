package sn.compte;

/**
 *
 * @author Muhammed Fode
 */
public class Compte {
    private int numCompte;
    private String typeCompte;
    private String nomTitulaireCompte;
    private String prenomTitulaireCompte;
    private int solde;
    
    public Compte()
    {}
    
    public Compte(int numCompte, String typeCompte, String nomTitulaireCompte,String prenomTitulaireCompte, int solde)
    {
        this.numCompte = numCompte;
        this.typeCompte = typeCompte;
        this.nomTitulaireCompte = nomTitulaireCompte;
        this.prenomTitulaireCompte = prenomTitulaireCompte;
        this.solde = solde;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public String getNomTitulaireCompte() {
        return nomTitulaireCompte;
    }

    public void setNomTitulaireCompte(String nomTitulaireCompte) {
        this.nomTitulaireCompte = nomTitulaireCompte;
    }

    public String getPrenomTitulaireCompte() {
        return prenomTitulaireCompte;
    }

    public void setPrenomTitulaireCompte(String prenomTitulaireCompte) {
        this.prenomTitulaireCompte = prenomTitulaireCompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.numCompte;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compte other = (Compte) obj;
        if (this.numCompte != other.numCompte) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nNumero Compte = " + numCompte + " \nType Compte = " + typeCompte + " \nNom Titulaire Compte = "
                + nomTitulaireCompte + " \nPrenom Titulaire Compte = " + prenomTitulaireCompte + " \nSolde = " + solde;
    }
    
    
    
}
