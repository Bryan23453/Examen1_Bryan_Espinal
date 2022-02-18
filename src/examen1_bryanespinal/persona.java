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
public abstract class persona {
    String nombre;
    String poder;
    String debilidad;
    String heroe_vilano;
    int fuerza;
    int habilidad_mental;
    int habilidad_ficica;
    boolean tiene_escuadron;

    public persona(String nombre, String poder, String debilidad, String heroe_vilano, int fuerza, int habilidad_mental, int habilidad_ficica, boolean tiene_escuadron) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.heroe_vilano = heroe_vilano;
        this.fuerza = fuerza;
        this.habilidad_mental = habilidad_mental;
        this.habilidad_ficica = habilidad_ficica;
        this.tiene_escuadron = tiene_escuadron;
    }

    public persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHeroe_vilano() {
        return heroe_vilano;
    }

    public void setHeroe_vilano(String heroe_vilano) {
        this.heroe_vilano = heroe_vilano;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidad_mental() {
        return habilidad_mental;
    }

    public void setHabilidad_mental(int habilidad_mental) {
        this.habilidad_mental = habilidad_mental;
    }

    public int getHabilidad_ficica() {
        return habilidad_ficica;
    }

    public void setHabilidad_ficica(int habilidad_ficica) {
        this.habilidad_ficica = habilidad_ficica;
    }

    public boolean isTiene_escuadron() {
        return tiene_escuadron;
    }

    public void setTiene_escuadron(boolean tiene_escuadron) {
        this.tiene_escuadron = tiene_escuadron;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", heroe_vilano=" + heroe_vilano + ", fuerza=" + fuerza + ", habilidad_mental=" + habilidad_mental + ", habilidad_ficica=" + habilidad_ficica + ", tiene_escuadron=" + tiene_escuadron + '}';
    }

    
    public abstract void final_chance();
}
