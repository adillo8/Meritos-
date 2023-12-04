package dominio;
import java.io.Serializable;

public abstract class Merito implements Serializable{
    protected String titulo;
    //constructor
    public Merito(String titulo) {
        this.titulo = titulo;
    }

    //setters y getters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public abstract double calcularValoracion();
}
