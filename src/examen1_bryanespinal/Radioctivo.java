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
public class Radioctivo extends persona {
    int edad;
    String tipo_accidente;

    public Radioctivo() {
    }

    public Radioctivo(int edad, String tipo_accidente, String nombre, String poder, String debilidad, boolean heroe_vilano, int fuerza, int habilidad_mental, int habilidad_ficica, boolean tiene_escuadron) {
        super(nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron);
        this.edad = edad;
        this.tipo_accidente = tipo_accidente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo_accidente() {
        return tipo_accidente;
    }

    public void setTipo_accidente(String tipo_accidente) {
        this.tipo_accidente = tipo_accidente;
    }
    
    public  void final_chance(){
    
    }

    @Override
    public String toString() {
        return "Radioctivo{" + "edad=" + edad + ", tipo_accidente=" + tipo_accidente + '}';
    }
    
}
