package dominio;
import java.util.ArrayList;
import java.io.Serializable;;

public abstract class Profesor implements Serializable {
    protected ArrayList <Merito> meritos =new ArrayList<>();
    protected String nombre;
    //constructor
    public Profesor(String nombre) {
        meritos = new ArrayList<>();
        this.nombre = nombre;
    }

    public abstract double calcularValoracion();
    public Profesor annadirMerito(Merito m){
        meritos.add(m);
        return this;
    }

    //metodo equals
    public boolean equals (Object obj){
        Profesor p = (Profesor) obj;
        return this.nombre.equals(p.nombre);
    }
    //metodo toString
    public String toString(){
        return "Nombre: "+ nombre + "\nMeritos: "meritos ;
    }
    
}
