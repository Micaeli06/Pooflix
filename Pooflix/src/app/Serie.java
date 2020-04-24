package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    //CONSTRUCTORES
    
    public Serie(String nombre, int anio){
        this.setNombre(nombre);
        this.setAnio(anio);
    }

    public Serie(String nombre, int anio, Genero genero, Clasificacion clasificacion){
        this(nombre,anio);
        this.setGenero(genero);
        this.setClasificacion(clasificacion);
    }

    private List<Temporada> temporadas = new ArrayList<>();

    public Temporada getTemporada (int nro) {
        for (Temporada tempo : this.temporadas){  //FOR ICH para lista
            if(tempo.getNumero() == nro){
                return tempo;
            }
        }
        return null;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
    

}