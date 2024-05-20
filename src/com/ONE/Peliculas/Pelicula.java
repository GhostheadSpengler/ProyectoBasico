package com.ONE.Peliculas;

import com.ONE.Pelicula.calculadora.Estrellas;

import java.util.*;
//PELICULA es un HIJO de TITULO. Lo cual quiere decir que (extends) le provee todas las instancias de la clase Titulo.
public class Pelicula extends Titulo implements Estrellas {
    @Override
    public int getEstrellas() { //NOTA: Se esta llamando al implemento Estrellas
        return (int) promedio()/2; //Y se hizo una conversion, ya que originalmente el codigo entregaba un resultado (double--> de Promedio) y se hizo un casteo para convertirlo a Entero (Int)
    }


    private String director;

    public void setDirector(String director) {
        this.director = director;
    }
}