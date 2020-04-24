package app;

import java.util.List;

public class Pelicula extends Contenido implements INominable {

    private Director director;
    private int duracionEnMinutos;

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

    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    public void reproducirTrailerNominacion() {
        // TODO Auto-generated method stub

    }

    public void secarSelfie(List<Actor> elenco) {
        // TODO Auto-generated method stub

    }

}