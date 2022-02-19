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
public class Alien extends Extraterrestre {
    String planeta;

    public Alien(String planeta, String nombre, String poder, String debilidad, boolean heroe_vilano, int fuerza, int habilidad_mental, int habilidad_ficica, boolean tiene_escuadron) {
        super(nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron);
        this.planeta = planeta;
    }

    

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }
    
    public void final_chance(){
    
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
