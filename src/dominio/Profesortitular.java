package dominio;

public class Profesortitular extends Profesor{
    //constructor
    public Profesortitular(String nombre) {
        super(nombre);
    }
    public double calcularValoracion() {
        double suma=0;
        if(meritos.size()==0){
            return 0;
        }
        else{
            for (Merito m: meritos){
                suma+=m.calcularValoracion();
            }
            return suma/meritos.size();
        }
       
    }
}
