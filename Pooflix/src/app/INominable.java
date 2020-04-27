package app;

import java.util.List;
//LA INTERFASE DECLARA MÉTODOS, LAS OTRAS CLASES LO IMPLEMENTAN
public interface INominable { //LAS INTERFACES no tienen codigo, no se intancian.
//agrupar clases bajo un conjunto de metodos.
    boolean ganoPreviamente();

    void reproducirTrailerNominacion();
    
    void secarSelfie(List<Actor> elenco);  //funcion con parametros
    
    boolean estaNominada();

}