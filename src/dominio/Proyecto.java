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
    public float valorar() {
        return financiación/100000;
    }
    
}
