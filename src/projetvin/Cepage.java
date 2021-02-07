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
public class Cepage {
    private String nomCepage;
    
    //constructeur
    public Cepage(String unNom)
        {
            nomCepage = unNom;
        }
    public String getNomCepage()
    {
        return nomCepage;
    }
    public void setNomCepage(String unCepage)
    {
        nomCepage = unCepage;
    }
}
