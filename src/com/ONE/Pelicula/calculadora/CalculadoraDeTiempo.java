package com.ONE.Pelicula.calculadora;

import com.ONE.Peliculas.Pelicula;
import com.ONE.Peliculas.Serie;
import com.ONE.Peliculas.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }
    //Se hace el metodo que calcule el tiempo, llamando al Paquete Pelicula.

    //Se crearon primero dos metodos para llamar tanto al tiempo de pelicula como de serie, pero Titulo comparte las caracteristicas de ambos, por lo que sera menos codigo y mas facil de llamar desde la Clase Principal.
    public void incluye (Titulo titulo){
        tiempoTotal+=titulo.getDuracion();
    }

//    public void incluye(Pelicula pelicula){
//        tiempoTotal+=pelicula.getDuracion();
//    }
//  public void incluye(Serie serie){
//        tiempoTotal+=serie.getDuracion();
//  }

}
