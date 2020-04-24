package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int numero;
    private List<Episodio> episodios = new ArrayList<>();

    public Episodio getEpisodio(int nro) {
        for (Episodio epi : this.episodios) {
            if (epi.getNumero() == nro) {
                return epi;
            }
        }
        return null;
    }
    /*
     * ESTO NO SE HACE public Websodio getWebsodio(int nro){ for (Websodio epi :
     * this.websodios){ if(epi.numero == nro){ return epi; } } return null; }
     */

    /**
     * @param pos
     * @return
     */

    public Episodio getEpisodioAtPosicion(int pos) {
        return this.episodios.get(pos);
    }

    public List<Websodio> obtenerWebsodios() {
        List<Websodio> lista = new ArrayList<>();
        for (Episodio epi : this.episodios) {
            if (epi instanceof Websodio)
                lista.add((Websodio) epi);
        }
        return lista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }

}
