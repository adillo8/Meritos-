package dominio;

public class Proyecto extends Merito{
    //atributos
    protected float financiación;
    //constructor
    public Proyecto(String titulo,float financiación) {
        super(titulo);
        this.financiación=financiación;
    }
    //definir metodo abstracto
    public double calcularValoracion() {
        return financiación/100000;
    }
    
}
