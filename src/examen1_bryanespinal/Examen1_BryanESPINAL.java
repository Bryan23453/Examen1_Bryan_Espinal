/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_bryanespinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Examen1_BryanESPINAL {

    static Scanner lea=new Scanner(System.in);
    ArrayList <persona> heroes=new ArrayList();
    ArrayList <persona> Villanos=new ArrayList();
    ArrayList <persona> Personas=new ArrayList();
    public static void main(String[] args) {
        boolean cont=true;
        while  (cont){
            System.out.println("1. agregar Escuadrones");
            System.out.println("2. Eliminar Escuadrones");
            System.out.println("3. Modificar Escuadrones");
            System.out.println("4. agregar SuperHeroes");
            System.out.println("5. agregar Villanos");
            System.out.println("6. modificar SuperHeroes");
            System.out.println("7. modificar Villanos");
            System.out.println("8. eliminar SuperHeroes");
            System.out.println("9. eliminar Villanos");
            System.out.println("10. simulacion ");
            System.out.print("Ingrese Opcion: ");
            int opc=lea.nextInt();
            switch(opc){
                case 1:{
                    
                }
                break;
                case 2:{
                    
                }
                break;
                case 3:{
                    
                }
                break;
                case 4:{
                    
                }
                break;
                case 5:{
                    
                }
                break;
                case 6:{
                    
                }
                break;
                case 7:{
                    
                }
                break;
            }
        }
    }
    
}
