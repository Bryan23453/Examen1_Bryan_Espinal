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
public class Super_Humano extends persona {
    String Superpoder;
    public  void final_chance(){
    
    }

    public Super_Humano(String Superpoder, String nombre, String poder, String debilidad, String heroe_vilano, int fuerza, int habilidad_mental, int habilidad_ficica, boolean tiene_escuadron) {
        super(nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron);
        this.Superpoder = Superpoder;
    }

    

    public Super_Humano() {
    }

    public String getSuperpoder() {
        return Superpoder;
    }

    public void setSuperpoder(String Superpoder) {
        this.Superpoder = Superpoder;
    }
    
}
