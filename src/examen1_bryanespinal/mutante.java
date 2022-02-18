/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_bryanespinal;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class mutante extends persona{
    ArrayList <String> factores=new ArrayList();
    public  void final_chance(){
    
    }

    public mutante(String nombre, String poder, String debilidad, String heroe_vilano, int fuerza, int habilidad_mental, int habilidad_ficica, boolean tiene_escuadron) {
        super(nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron);
    }

    public mutante() {
    }

    public ArrayList<String> getFactores() {
        return factores;
    }

    public void setFactores(ArrayList<String> factores) {
        this.factores = factores;
    }
    
}
