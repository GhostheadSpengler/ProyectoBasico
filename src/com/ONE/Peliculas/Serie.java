package com.ONE.Peliculas;

import com.ONE.Pelicula.calculadora.Estrellas;

public class Serie extends Titulo implements Estrellas {
    int temporadas;
    int episodioTemp;

    int minEpisodio;


//  /*********** SE GENERAN LOS SETTER Y O GETTERS **********/

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodioTemp(int episodioTemp) {
        this.episodioTemp = episodioTemp;
    }

    public void setMinEpisodio(int minEpisodio) {
        this.minEpisodio = minEpisodio;
    }

    @Override
    public int getDuracion() {
        return minEpisodio*temporadas * episodioTemp ;
    }

    @Override
    public int getEstrellas() {
        return 0;
    }
}
