package dominio;

public class Articulo extends Merito{
    //atributos
    protected float impacto;
    //constructor
    public Articulo(String titulo,double impacto) {
        super(titulo);
        this.impacto=Float.parseFloat(String.valueOf(impacto));
    }
    //se define el metodo abstracto
    public double calcularValoracion() {
        return impacto;
    }
    
}
