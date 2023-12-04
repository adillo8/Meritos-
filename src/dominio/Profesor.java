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
    
}
