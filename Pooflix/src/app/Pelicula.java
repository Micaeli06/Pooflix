package app;

import java.util.List;

import app.personas.*;
/*import app.personas.Actor; / esto es lo mismo que import app.personas.*;
import app.personas.Director;*/

public class Pelicula extends Contenido implements INominable {

    // ATRIBUTOS

    private String nombre;
    private Director director;
    private int duracionEnMinutos;

    // Getter y Setter
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // METODOS
    public boolean ganoPreviamente() {
        return false;
    }

    public void reproducirTrailerNominacion() {
        System.out.println("Reproduciendo trailer pelicula" + this.getNombre());
    }

    public void sacarSelfie(List<Actor> elenco) {
    }

    public boolean estaNominada() {
        return false;
    }
}
