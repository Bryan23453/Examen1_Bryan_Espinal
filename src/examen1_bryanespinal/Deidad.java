/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_bryanespinal;

/**
 *
 * @author bryan
 */
public class Deidad extends Extraterrestre {
    boolean creyentes;
    String religion;

    public Deidad(boolean creyentes, String religion) {
        this.creyentes = creyentes;
        this.religion = religion;
    }

    

    public boolean isCreyentes() {
        return creyentes;
    }

    public void setCreyentes(boolean creyentes) {
        this.creyentes = creyentes;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
    
    public void final_chance(){
    
    }
    
}
