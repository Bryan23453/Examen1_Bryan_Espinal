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
    static ArrayList <persona> heroes=new ArrayList();
    static ArrayList <persona> Villanos=new ArrayList();
    static ArrayList <persona> Personas=new ArrayList();
    static ArrayList <escuadrones> escuadrones=new ArrayList();
    static ArrayList <universo> universo=new ArrayList();
    public static void main(String[] args) {
        boolean cont=true;
        while  (cont){
            System.out.println("0. Salir");
            System.out.println("1. Opciones Universo");
            System.out.println("2. Opciones Escuadrones");
            System.out.println("3. Opciones Persona");;
            System.out.print("Ingrese Opcion: ");
            int opc=lea.nextInt();
            switch(opc){
                case 0:{
                   cont=false; 
                }
                break;
                case 1:{
                    System.out.println("1. crear Universo");
                    System.out.println("2. Eliminar Universo");
                    System.out.println("3. Modificar Universo");
                    System.out.println("4. listar Universo");
                    System.out.print("Ingrese Opcion: ");
                    int opc1=lea.nextInt();
                    System.out.println();
                    switch(opc1){
                        case 1:{
                            System.out.println("Ingrese Nombre Del Universo");
                            String nom=lea.nextLine();
                            nom=lea.nextLine();
                            universo.add(new universo(nom));
                        }
                        break;
                        case 2:{
                            int i=0;
                            for (universo univ : universo) {
                                i++;
                                System.out.println("Universo "+i+" "+univ);
                            }
                            System.out.print("Ingrese Numero Del Universo a Eliminar: ");
                            int elim=lea.nextInt();
                            universo.remove(i-1);
                        }
                        break;
                        case 3:{
                            int i=0;
                            for (universo univ : universo) {
                                i++;
                                System.out.println("Universo "+i+" "+univ);
                            }
                            System.out.print("Ingrese Numero Del Universo a modificar: ");
                            int elim=lea.nextInt();
                            universo.remove(i-1);
                            System.out.println("1- Agregar Escuadrones");
                            System.out.println("2- Elimar Escuadrones");
                            int agreg=lea.nextInt();
                            switch(agreg){
                                case 1:{
                                
                                }
                                break;
                                case 2:{
                                
                                }
                                break;
                            }
                        }
                        break;
                        case 4:{
                            int i=0;
                            for (universo univ : universo) {
                                i++;
                                System.out.println("Universo "+i+" "+univ);
                            }
                        }
                        break;
                    }
                }
                break;
                case 2:{
                    System.out.println("1. crear Escuadrones");
                    System.out.println("2. Eliminar Escuadrones");
                    System.out.println("3. Modificar Escuadrones");
                    System.out.println("4. listar Escuadrones");
                    System.out.print("Ingrese Opcion: ");
                    int opc1=lea.nextInt();
                    switch(opc1){
                        case 1:{
                            System.out.println("Ingrese nombre");
                            String nom=lea.nextLine();
                            nom=lea.nextLine();
                            System.out.println("Ingrese Lugar Donde Se Encuentra El Escuadron");
                            String Lugar=lea.nextLine();
                            System.out.println("Ingrese Base Del Escuadron");
                            String base=lea.nextLine();
                            System.out.println("1- Villano");
                            System.out.println("2- SuperHeroe");
                            System.out.print("Ingrese de que sera el escuadron: ");
                            int opcs=lea.nextInt();
                            boolean hero_villa;
                            switch(opcs){
                                case 1:{
                                    hero_villa=false;
                                }
                                break;
                                case 2:{
                                    hero_villa=true;
                                }
                                break;
                            }
                        }
                        break;
                        case 2:{
                            escuadrones.add(new escuadrones());
                            int i=0;
                            for (escuadrones escua : escuadrones) {
                                i++;
                                System.out.println(i+" "+escua);
                            }
                            System.out.println();
                            System.out.print("Seleccione escuadron a eliminar: ");
                            int eli=lea.nextInt();
                            escuadrones.remove(i-1);
                        }
                        break;
                        case 3:{
                        int i=0;
                            for (escuadrones escua : escuadrones) {
                                i++;
                                System.out.println(i+" "+escua);
                            }
                            System.out.print("Seleccione escuadron a modificar: ");
                            int eli=lea.nextInt();
                        }
                        break;
                        case 4:{
                        int i=0;
                            for (escuadrones escua : escuadrones) {
                                i++;
                                System.out.println(i+" "+escua);
                            }
                        }
                        break;
                    }
                }
                break;
                case 3:{
                    System.out.println("1. crear Persona");
                    System.out.println("2. Eliminar Persona");
                    System.out.println("3. Modificar Persona");
                    System.out.println("4. listar Persona");
                    System.out.print("Ingrese Opcion: ");
                    int opc1=lea.nextInt();
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
                    }
                }
                break;
                
                
            }
        }
    }
    
}
