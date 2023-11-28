package dominio;

public class Catedratico extends Profesor {
    //constructor
    public Catedratico(String nombre) {
        super(nombre);
    }

    public double calcularValoracion() {
        double suma=0;
        for (Merito m: meritos){
            suma+=Math.pow(m.calcularValoracion(),2);
        }
        return Math.pow(suma/4,0.5);
    }

   
}
    
