package com.ONE.Peliculas;

import java.util.*;
public class Pelicula extends Titulo{
    //PELICULA es un HIJO de TITULO. Lo cual quiere decir que (extends) le provee todas las instancias de la clase Titulo.

    private String director;

    public void setDirector(String director) {
        this.director = director;
    }
}