package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    public List<INominable> nominados = new ArrayList<>();

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.getNombre().equals(titulo))
                return s;
        }
        return null;

    }

    public void inicializarCatalogo() {
        this.inicializarBreakingBad();
        this.inicializarPelis();

    }

    private void inicializarPelis() {
        Pelicula peli = new Pelicula();
        peli.setNombre("Diario de una pasion");
        Actor actor = new Actor();
        actor.setNombre("Ryan");

        this.peliculas.add(peli);

        peli = new Pelicula();
        peli.setNombre("Harry Potter");
        actor = new Actor();
        actor.setNombre("Daniel");

        this.peliculas.add(peli);

    }

    public void inicializarBreakingBad() {

        Clasificacion clasificacionBb;
        clasificacionBb = new Clasificacion();

        clasificacionBb.setTipo("Mayores de 13");
        clasificacionBb.setEdadMin(13);
        clasificacionBb.setDescripcion("Contiene esenas de violencia");

        Genero generoBb;
        generoBb = new Genero();

        generoBb.setNombre("Acción");
        generoBb.setDescripcion("Escenas de acción");

        Actor actorBb1;
        actorBb1 = new Actor();
        actorBb1.setNombre(" Bryan Cranston ");

        Actor actorBb2;
        actorBb2 = new Actor();
        actorBb2.setNombre(" Aaron Paul ");

        // Serie 1
        Serie serie1 = new Serie("Breaking Bad", 2020);
        this.series.add(serie1);

        serie1.setAnio(2008);
        serie1.setCalificacion(9);
        serie1.setClasificacion(clasificacionBb);
        serie1.setGenero(generoBb);
        serie1.setDescripcion(" Descripción ");
        serie1.getElenco().add(actorBb2);

        // Serie 1 TEMPORADAS
        Temporada serie1T1 = new Temporada();
        serie1T1.setNumero(1);
        serie1.getTemporadas().add(serie1T1);

        // Serie 1 EPISODIOS
        Episodio serie1T1E1 = new Episodio(1, "Primer episodio", 43);
        serie1T1.getEpisodios().add(serie1T1E1);

        Episodio serie1T1E2 = new Episodio(2, "Segundo episodio", 50);
        serie1T1.getEpisodios().add(serie1T1E2);

        Websodio webi = new Websodio(20, "Episodio web ", 30, "http//:direccion.com");
        serie1T1.getEpisodios().add(webi);

        /*
         * ESTO NO SE HACE: AGREGARLO A UNA LISTA serie1T1.websodios.add(webi);
         */

    }

    // INICIALIZAMOS LA LISTA DE NOMINADOS

    public void inicializarListaNominados() {

        for (Pelicula peli : this.peliculas) {
            this.nominados.add(peli);
            for (Actor actor : peli.getElenco()) // RECORRO LOS ACTORES PARA AGREGARLOS A LISTA DE NOMINADOS
                this.nominados.add(actor);

        }
        for (Serie serie : this.series) {
            for (Actor actor : serie.getElenco())
                this.nominados.add(actor);

        }
    }

    public void reproducirTrailersDeNominacion() {
        for (INominable nominado : nominados) {
            nominado.reproducirTrailerNominacion();
        }
    }

}