package interfaz;
import dominio.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Interfaz {
    //declarar ArrayList
    public static ArrayList <Profesor> profesores;
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
        profesores = new ArrayList<>();
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
        System.out.println("Ingrese el nombre del profesor");
        
    }
    
}
