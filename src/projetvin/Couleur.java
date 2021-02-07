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
public class Couleur {
    private String nomCouleur;
    
    public Couleur (String unNom)
    {
        nomCouleur = unNom;
    }
    public String getNomCouleur()
    {
        return nomCouleur;
    }
    public void setNomCouleur(String unNom)
    {
        nomCouleur = unNom;
    }
}
