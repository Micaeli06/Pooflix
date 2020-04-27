package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        Serie bb = miPooflix.buscarSerie("Breaking Bad");

        Temporada laMejorTemporada = bb.getTemporada(1); // bb es el llamador es de tipo Serie

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(20);

        elTop.reproducir();

        /*
         * ESTO NO SE HACE Websodio webi = laMejorTemporada.getWebsodio(20);
         * 
         * webi.reproducir(); System.out.println( "Url:" + webi.url);
         */

        System.out.println(" Empezando otra cosa ");

        Episodio epiDemo;
        int posicion = 0;

        // En base a un numero de posicion de episodio, obtenerlo de la lista
        System.out.println(" Ingrese la posicion");

        posicion = Teclado.nextInt();

        epiDemo = laMejorTemporada.getEpisodioAtPosicion(posicion);

        epiDemo.reproducir();

        // Primero preguntar de que tipo es. Usando el poerador "instanceOf"
        // Segundo: castearlo al tipo conrrespondiente (es decir, TRANSFORMARLO)
        // Usando el operador de Casteo

        if (epiDemo instanceof Websodio) {
            Websodio webi = (Websodio) epiDemo; // (websodio) es el operador de casteo
            webi.enviarAlertaDeQueEstaOnline();
        } else {
            System.out.println(" No hay que hacer mas nada con un Episodio");
        }

        miPooflix.inicializarListaNominados();

        miPooflix.reproducirTrailersDeNominacion();

        



    }
}