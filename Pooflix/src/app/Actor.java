package app;

import java.util.List;

public class Actor extends Persona implements INominable {

    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//METODOS
    public boolean ganoPreviamente() {
        // Acá va la lógica para ver si está en 
        //una base de datos de ganadores previos
        return false;
    }

    public void reproducirTrailerNominacion() {
       
    }

    public void secarSelfie(List<Actor> elenco) {
        
    }
    

}