package dominio;

public abstract class Merito {
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
    public abstract float valorar();
}
