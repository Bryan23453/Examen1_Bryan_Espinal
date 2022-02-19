/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_bryanespinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Examen1_BryanESPINAL {

    static Scanner lea=new Scanner(System.in);
    static ArrayList <persona> heroes=new ArrayList();
    static ArrayList <persona> Villanos=new ArrayList();
    //static ArrayList <persona> Personas=new ArrayList();
    static ArrayList <escuadrones> escuadrones=new ArrayList();
    static ArrayList <universo> universo=new ArrayList();
    public static void main(String[] args) {
        universo.add(new universo("UHC"));
        heroes.add (new persona_normal("PACO","VOLAR","Plutonio",true,50,20,60,false));
        Villanos.add (new persona_normal("pancho","caminar rapido","Plutonio",false,45,25,45,false));
        escuadrones.add(new escuadrones("escuadron de la justicia","usa","ontariojr",true));
        universo.get(0).setEscua(escuadrones.get(0));
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
                            if (universo.size()==0) {
                                System.out.println("No hay Universos ");
                            }else{
                                int i=0;
                                for (universo univ : universo) {
                                    i++;
                                    System.out.println("Universo "+i+" "+univ);
                                }
                                System.out.print("Ingrese Numero Del Universo a Eliminar: ");
                                int elim=lea.nextInt();
                                universo.remove(i-1);
                            }
                        }
                        break;
                        case 3:{
                            if (universo.size()==0) {
                                System.out.println("No hay Universos ");
                                System.out.println();
                            }else{
                                int i=0;
                                for (universo univ : universo) {
                                    i++;
                                    System.out.println("Universo "+i+" "+univ);
                                }
                                System.out.print("Ingrese Numero Del Universo a modificar: ");
                                int elim=lea.nextInt();
                                System.out.println("Ingrese Nuevo nombre del Universo");
                                String agreg=lea.nextLine();
                                agreg=lea.nextLine();
                                universo.get(elim-1).setNombre(agreg);
                            }
                            System.out.println();
                        }
                        break;
                        case 4:{
                            
                            if (universo.size()==0) {
                                System.out.println("No hay Universos ");
                            }else{
                                int i=0;
                                for (universo univ : universo) {
                                    i++;
                                    System.out.println("Universo "+i+" "+univ);
                                }
                            }
                        }
                        break;
                    }
                }
                break;
                case 2:{
                    boolean continuar=true;
                    if (universo.size()==0) {
                        System.out.println("No puede agregar escuadrones si no hay universo");
                        continuar=false;
                    }
                    if (heroes.size()==0||Villanos.size()==0) {
                        System.out.println("cree personas primero para poder agregar escuadrones");
                        continuar=false;
                    }
                    if (continuar) {
                        System.out.println("1. crear Escuadrones");
                        System.out.println("2. Eliminar Escuadrones");
                        System.out.println("3. Modificar Escuadrones");
                        System.out.println("4. listar Escuadrones");
                        System.out.println("5. Agregar Personas");
                        System.out.println("6. simular");
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
                                System.out.println("Seleccione el universo en el que agregara el escuadron");
                                int i=0;
                                for (universo univ : universo) {
                                    i++;
                                    System.out.println("Universo "+i+" "+univ);
                                }
                                System.out.println("Ingrese Numero Del Universo");
                                int universoss=lea.nextInt();
                                if (universoss<1||universoss>i) {
                                    System.out.println("Ese universo no existe");
                                    break;
                                }
                                
                                System.out.println("1- Villano");
                                System.out.println("2- SuperHeroe");
                                System.out.print("Ingrese de que sera el escuadron: ");
                                int opcs=lea.nextInt();
                                boolean hero_villa=true;
                                switch(opcs){
                                    case 1:{
                                        hero_villa=false;
                                        
                                        escuadrones.add(new escuadrones(nom,Lugar,base,hero_villa));
                                        universo.get(universoss-1).setEscua(escuadrones.get(escuadrones.size()));
                                    }
                                    break;
                                    case 2:{
                                        hero_villa=true;
                                        escuadrones.add(new escuadrones(nom,Lugar,base,hero_villa));
                                        universo.get(universoss-1).setEscua(escuadrones.get(escuadrones.size()));
                                    }
                                    break;
                                    default:{
                                        System.out.println("Opcion invalida");  
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
                            case 5:{
                            int i=0;
                                System.out.println("Ingrese A que escuadron Quiere agregar personas");
                                for (escuadrones escua : escuadrones) {
                                    i++;
                                    System.out.println(i+" "+escua);
                                }
                                System.out.print("Seleccione escuadron a modificar: ");
                                int eli=lea.nextInt();
                                escuadrones escua=escuadrones.get(eli-1);
                                i=0;
                                if (escua.isHeroe_villa()) {
                                    for (persona per : heroes) {
                                        i++;
                                        System.out.println(i+" "+heroes);
                                    }
                                    System.out.println("Selecione heroe a agregar");
                                    int selec=lea.nextInt();
                                    escua.setMiebros(heroes.get(selec-1));
                                }else{
                                    for (persona per : Villanos) {
                                        i++;
                                        System.out.println(i+" "+Villanos);
                                    }
                                    System.out.println("Selecione villano a agregar");
                                    int selec=lea.nextInt();
                                    escua.setMiebros(Villanos.get(selec-1));
                                }
                                
                            
                            
                            
                            }
                            break;
                            case 6:{
                            int i=0;
                                System.out.println("Ingrese A el 1 escuadron que peleara");
                                for (escuadrones escua : escuadrones) {
                                    i++;
                                    System.out.println(i+" "+escua);
                                }
                                System.out.print("Seleccione escuadron : ");
                                int selec=lea.nextInt();
                                
                                System.out.println("Ingrese A el 2 escuadron que peleara");
                                for (escuadrones escua : escuadrones) {
                                    i++;
                                    System.out.println(i+" "+escua);
                                }
                                System.out.print("Seleccione escuadron: ");
                                int selec2=lea.nextInt();
                                
                            }
                            break;
                        }
                    }
                }
                break;
                case 3:{
                     boolean continuar=true;
                    if (universo.size()==0) {
                        System.out.println("No puede agregar personas si no hay universo");
                        continuar=false;
                    }
                    if (continuar) {
                        System.out.println("1. crear Persona");
                        System.out.println("2. Eliminar Persona");
                        System.out.println("3. Modificar Persona");
                        System.out.println("4. listar Persona");
                        System.out.print("Ingrese Opcion: ");
                        int opc1=lea.nextInt();
                        switch(opc1){
                            case 1:{
                                System.out.println("Ingrese nombre");
                                String nombre=lea.nextLine();
                                nombre=lea.nextLine();
                                System.out.println("Ingrese poder");
                                String poder=lea.nextLine();
                                System.out.println("Ingrese debilidad");
                                String debilidad=lea.nextLine();
                                System.out.println("1- villano");
                                System.out.println("2- Super Heroe");
                                System.out.print("Ingrese Opcion: ");
                                int opc2=lea.nextInt();
                                boolean heroe_vilano=true;
                                if (opc2==1) {
                                    heroe_vilano=false;
                                }else{
                                    if (opc2==2) {
                                        heroe_vilano=true;
                                    }else{
                                        System.out.println("Opcion Invalida");
                                        break;
                                    }
                                }
                                System.out.println("Ingrese fuerza");
                                int fuerza=lea.nextInt();
                                System.out.println("Ingrese habilidad mental");
                                int habilidad_mental=lea.nextInt();
                                System.out.println("Ingrese habilidad ficica");
                                int habilidad_ficica=lea.nextInt();
                                if (fuerza+habilidad_ficica+habilidad_mental>150 || fuerza+habilidad_ficica+habilidad_mental<100) {
                                    System.out.println("Esta persona es muy debil para ser un heroe / villano ");
                                    break;
                                }
                                boolean tiene_escuadron=false;
                                System.out.println("selecione que especie es ");
                                System.out.println("1- persona nomal");
                                System.out.println("2- super humano");
                                System.out.println("3- radioctivo");
                                System.out.println("4- deidad");
                                System.out.println("5- Alien");
                                System.out.println("6- Mutante");
                                System.out.println("Ingrese opcion: ");
                                int superrr=lea.nextInt();
                                switch(superrr){
                                case 1:{
                                    if (heroe_vilano) {
                                        heroes.add (new persona_normal(nombre,poder,debilidad,heroe_vilano,fuerza,habilidad_mental,habilidad_ficica,tiene_escuadron));
                                    }else{
                                        Villanos.add (new persona_normal(nombre,poder,debilidad,heroe_vilano,fuerza,habilidad_mental,habilidad_ficica,tiene_escuadron));
                                    }
                                    
                                }
                                break;
                                case 2:{
                                    System.out.println("Ingrese Superpoder");
                                    String superpoder=lea.nextLine();
                                    if (heroe_vilano) {
                                        heroes.add (new Super_Humano(superpoder, nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron));
                                    }else{
                                        Villanos.add (new Super_Humano(superpoder, nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron));
                                    }
                                }
                                break;
                                case 3:{
                                    System.out.println("Ingrese Edad Que Tenia Cuando Paso Accidente");
                                    int edad=lea.nextInt();
                                    System.out.println("Ingrese Tipo De Accidente");
                                    String tipo_accidentelea=lea.nextLine();
                                    tipo_accidentelea=lea.nextLine();
                                    if (heroe_vilano) {
                                        heroes.add (new Radioctivo(edad, tipo_accidentelea, nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron));
                                    }else{
                                        Villanos.add (new Radioctivo(edad, tipo_accidentelea, nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron));
                                    }
                                }
                                break;
                                case 4:{
                                    boolean creyentes=true;
                                    boolean conte=true;
                                    System.out.println("Tiene creyentes\n"
                                            + "1- si"
                                            + "\n2- no");
                                    int cre=lea.nextInt();
                                    switch(cre){
                                        case 1:{
                                            creyentes=true;
                                        }
                                        break;
                                        case 2:{
                                            creyentes=false;
                                        }
                                        break;
                                        default:{
                                            System.out.println("Opcion Invalida");
                                            conte=false;
                                        }
                                    }
                                    if (conte) {
                                        System.out.println("Ingrese religion");
                                        String religion=lea.nextLine();
                                        religion=lea.nextLine();
                                        if (heroe_vilano) {
                                        heroes.add (new Deidad(creyentes, religion, nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron));
                                        }else{
                                            Villanos.add (new Deidad(creyentes, religion, nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron));
                                        }
                                    }
                                }
                                break;
                                case 5:{
                                    System.out.println("Ingrese planeta");
                                    String planeta=lea.nextLine();
                                        if (heroe_vilano) {
                                            heroes.add (new Alien(planeta,nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron));
                                        }else{
                                            Villanos.add (new Alien(planeta,nombre, poder, debilidad, heroe_vilano, fuerza, habilidad_mental, habilidad_ficica, tiene_escuadron));
                                        }
                                }
                                break;
                                case 6:{
                                    System.out.println("Ingrese la cantidad de factores del mutante");
                                    int fac=lea.nextInt();
                                    ArrayList <String> factores=new ArrayList();
                                    String a=lea.nextLine();
                                    for (int i = 1; i <=fac; i++) {
                                        System.out.print("Ingrese factor numero "+i+": ");
                                        a=lea.nextLine();
                                        factores.add(a);
                                    }
                                    mutante mut=new mutante(nombre,poder,debilidad,heroe_vilano,fuerza,habilidad_mental,habilidad_ficica,tiene_escuadron);
                                    mut.setFactores(factores);
                                    if (heroe_vilano) {
                                            heroes.add (mut);
                                        }else{
                                            Villanos.add (mut);
                                        }
                                }
                                break;

                                }
                            }
                            break;
                            case 2:{
                                int i=0;
                                for (persona per : Villanos) {
                                    i++;
                                    System.out.println(i+" "+Villanos);
                                }
                                for (persona per : heroes) {
                                    i++;
                                    System.out.println(i+" "+heroes);
                                }
                                System.out.print("Ingrese Numero De la persona a Eliminar: ");
                                int elim=lea.nextInt();
                                if (elim<=Villanos.size()) {
                                    Villanos.remove(elim-1);
                                }else{
                                    elim=elim-Villanos.size();
                                    heroes.remove(elim-1);
                                }
                                
                            }
                            break;
                            case 3:{
                                int i=0;
                                for (persona per : Villanos) {
                                    i++;
                                    System.out.println(i+" "+Villanos);
                                }
                                for (persona per : heroes) {
                                    i++;
                                    System.out.println(i+" "+heroes);
                                }
                                System.out.print("Ingrese Numero De la persona a Modificar: ");
                                int elim=lea.nextInt();
                                if (elim>Villanos.size()) {
                                    persona vi=Villanos.get(elim-1);
                                    System.out.println("Que Dato Decea Cambiar");
                                    System.out.println("1- Nombre");
                                    System.out.println("2- poder");
                                    System.out.println("3- fuerza");
                                    System.out.println("4- habilidad_mental");
                                    System.out.println("5- habilidad_ficica");
                                    if (vi instanceof Alien) {
                                        System.out.println("6- planeta");
                                    }else{
                                        if (vi instanceof Deidad) {
                                            System.out.println("6- creyentes");
                                            System.out.println("7- religion");
                                        }
                                    }
                                }else{
                                
                                }
                            }
                            break;
                            case 4:{
                                int i=0;
                                ArrayList<String> a=new ArrayList();
                                for (persona per : heroes) {
                                    a.add(heroes.toString());
                                }
                                for (persona per : Villanos) {
                                    a.add(heroes.toString());
                                }
                                Collections.sort(a);
                                for (int j = 0; j < a.size(); j++) {
                                    i++;
                                   System.out.println(i+" "+a.get(j)); 
                                }
                            }
                            break;
                        }
                }
                }
                break;
                
                
            }
        }
    }
    
}
