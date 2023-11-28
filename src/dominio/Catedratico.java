package dominio;

public class Catedratico extends Profesor {
    //constructor
    public Catedratico(String nombre) {
        super(nombre);
    }

    public float valorar() {
        float suma=0;
        for (Merito m: meritos){
            suma+=m.valorar**2();
        }
        return valoracion;
    }

   
}
    
