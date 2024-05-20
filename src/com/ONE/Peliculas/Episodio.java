package com.ONE.Peliculas;

import com.ONE.Pelicula.calculadora.Estrellas;

public class Episodio extends Titulo implements Estrellas {

    /************INICIALIZA VARIABLES***********/

    private int capitulo;
    private int nombreCapitulo;

    private Serie serie; //Se llama a clase Serie para relacionarla con los datos del Capitulo.

    private int totalViews; //Variable para el ejemplo del return de implement "Estrellas"

    /************ CREA (Setter & Getters)***********/

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public int getNombreCapitulo() {
        return nombreCapitulo;
    }

    public void setNombreCapitulo(int nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getEstrellas() { //SE IMPLEMENTO el metodo que se comunica y llama a "ESTRELLAS"
//        return (int) promedio()/2; EJEMPLO UNO REPTIDO EN PELICULA

        if (totalViews>100){  //Ejemplo 2, para demostrar que se pueden cambiar las reglas de uso del implements
            return 4;
        } else
            return 2;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }
}

//Hubo problemas al principio, ya que no estaba vinculado el "Episodio" como hija de Titulo. Importante hacer la conexion, de lo contrario no reconocera al Implemento.