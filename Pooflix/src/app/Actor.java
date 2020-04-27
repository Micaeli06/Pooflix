package app;

import java.util.List;

public class Actor extends Persona implements INominable {

    private String nombre;
//getter y setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
// METODOS de INominable
    public boolean ganoPreviamente() {
        // Acá va la lógica para ver si está en 
        //una base de datos de ganadores previos
        return false;
    }

    public void reproducirTrailerNominacion() {
        System.out.println( "Reproduciendo trailer pelicula" + this.getNombre());
    }

    public void secarSelfie(List<Actor> elenco) {
        
    }

    public boolean estaNominada() {
        return false;
    }
    

    public void decirDiscurso(){
        System.out.println(" Gracias a todos");
    }

}