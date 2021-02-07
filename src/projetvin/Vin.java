/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetvin;

/**
 *
 * @author Abouc
 */
public class Vin {
    private String nomVin;
    private int millesimeVin;
    private Cepage leCepage;
    private Couleur laCouleur;
    private double prixDuVin;
    
    public Vin( String unNom, int unMillesime, Cepage unCepage, Couleur uneCouleur, double unPrix)
    {
        nomVin = unNom;
        millesimeVin = unMillesime;
        leCepage = unCepage;
        laCouleur = uneCouleur;
        prixDuVin = unPrix;
    }
    public String getNomVin()
    {
        return nomVin;
    }
    public void setNomVin(String unNom)
    {
        nomVin = unNom;
    }
    public int getMillesimeVin()
    {
        return millesimeVin;
    }
    public void setMillesimeVin(int unMillesime)
    {
        millesimeVin = unMillesime;
    }
    public Cepage getLeCepage()
    {
        return leCepage;
    }
    public void setLeCepage(Cepage unCepage)
    {
        leCepage = unCepage;
    }
    public Couleur getLacouleur ()
    {
        return laCouleur;
    }
    public void setLaCouleur(Couleur uneCouleur)
    {
        laCouleur = uneCouleur;
    }
    public double getPrixDuVin()
    {
        return prixDuVin;
    }
    public void setPrixDuVin (double unPrix)
    {
        prixDuVin = unPrix;
    }
}
