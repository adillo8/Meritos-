package dominio;

public class Articulo extends Merito{
    //atributos
    protected float impacto;
    //constructor
    public Articulo(String titulo,float impacto) {
        super(titulo);
        this.impacto=impacto;
    }
    //se define el metodo abstracto
    public float valorar() {
        return impacto;
    }
    
}
