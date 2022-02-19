
package examen1_bryanespinal;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class universo {
    String nombre;
    ArrayList <escuadrones> escua=new ArrayList();

    public universo(String nombre) {
        this.nombre = nombre;
    }

    public universo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<escuadrones> getEscua() {
        return escua;
    }

    public void setEscua(escuadrones escua) {
        this.escua .add(escua);
    }

    @Override
    public String toString() {
        return " nombre: " + nombre + ", Escuadrones En El Universo: " + escua ;
    }
    
}
