package interfaz;
import dominio.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {
    //declarar ArrayList
    public static ArrayList <Profesor> profesores;
    //scanner
    private Scanner sc = new Scanner(System.in);
    //constructor
    public Interfaz() {
        leerProfesores();
    }
    private void leerProfesores(){
        //leer archivo
        ObjectInputStream obj;
        File file = new File("contactos.txt");
        try{
        obj = new ObjectInputStream(new FileInputStream(file));
        try{
            profesores = (ArrayList<Profesor>)obj.readObject();
        }
        catch(Exception e){
            System.out.println(e);}
            obj.close();
        } 
        catch(Exception e){
        profesores = new ArrayList<Profesor>();
        }
        
    }
    
    private void grabar(){
        //grabar archivo
        ObjectOutputStream obj;
        File file = new File("contactos.txt");
        try{
            obj = new ObjectOutputStream(new FileOutputStream(file));
            obj.writeObject(profesores);
            obj.close();
            
            System.out.println("El archivo ha sido guardado");
        } 
        catch(Exception e){
            System.out.println("Error al guardar");
            System.out.println(e);
        };

    }

    private void anadirProfesorTitular(){
        System.out.print("Ingrese el nombre del profesor");
        String nombre = sc.nextLine();
        profesores.add(new Profesortitular(nombre));
    } 
        
    private void anadirCatedratico(){
        System.out.print("Ingrese el nombre del catedratico");
        String nombre = sc.nextLine();
        profesores.add(new Catedratico(nombre));
    }

    private void annadirMerito(){
        System.out.print("Ingrese el nombre del profesor");
        String nombre = sc.nextLine();
        int n = profesores.indexOf(new Profesortitular(nombre));
        if (n==-1){
            System.out.println("No se encontro el profesor");
            return;
        }else {

        System.out.println("Ingrese el titulo de merito");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el tipo de merito");
        System.out.println("1. Articulo");
        System.out.println("2. Proyecto");
        int tipo = sc.nextInt();
        sc.nextLine();
        if(tipo==1){
            System.out.println("Ingrese el impacto del articulo");
            float impacto = sc.nextFloat();
            sc.nextLine();
            profesores.get(n).annadirMerito(new Articulo(titulo,impacto));
        }
        else if(tipo==2){
            System.out.println("Ingrese la financiacion del proyecto");
            float financiacion = sc.nextFloat();
            sc.nextLine();
            profesores.get(n).annadirMerito(new Proyecto(titulo,financiacion));
        }
        else{
            System.out.println("Opcion no valida");
        }
        }
        
    }

    private void borrarProfesor(){
        System.out.print("Ingrese el nombre del profesor");
        String nomb = sc.nextLine();
        Profesortitular p = new Profesortitular(nomb);
        int posicion = profesores.indexOf(p);//busca por posicion
        if(posicion==-1){
            System.out.println("No se encontro el profesor");
            return;
        }
        else{
            profesores.remove(posicion);
        }
        
    }

    private int menu(){
        System.out.println("-----MENU-----");
        System.out.println("1. Anadir profesor titular");
        System.out.println("2. Anadir catedratico");
        System.out.println("3. Annadir merito");
        System.out.println("4. Borrar profesor");
        System.out.println("5. Mostrar profesor");
        System.out.println("6. Salir");
        System.out.println("Ingrese una opcion");
        String opcion = sc.nextLine();//como no lo tratan como numero no se usa nextInt
        return opcion;
    }

    private void ejecutar(){
        //estructura do while porque al menos lo tiene que hacer una vez 
        String opcion;
        do{
            opcion=menu();
            switch(opcion){
                case "1":
                    anadirProfesorTitular();
                    break;
                case "2":
                    anadirCatedratico();
                    break;
                case "3":
                    annadirMerito();
                    break;
                case "4":
                    borrarProfesor();
                    break;
                case "5":
                    mostrarProfesor();
                    break;
                case "6":
                grabar();   
                System.out.println("No te vayas :,(");
                    break;
                default:
                    System.out.println("Opcion no valida :()");
                    break;
            }
        }while(opcion!=6);

    }

    private void mostrar(){
        System.out.println("Profesores: "+profesores);
        System.out.println("pulse <enter> para continuar");
        sc.nextLine();
    }

    

}




