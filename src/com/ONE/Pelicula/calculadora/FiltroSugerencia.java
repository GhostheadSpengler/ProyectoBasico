package com.ONE.Pelicula.calculadora;

public class FiltroSugerencia {

    //Se vincula inicialmente con "ESTRELLAS", mandandola llamar.
    public void filtra(Estrellas estrellas){
        if(estrellas.getEstrellas()>= 4){
            System.out.println("Titulo mejor evaluado");
        } else if (estrellas.getEstrellas()>=2) {
            System.out.println("Popular al momento");

        } else {
            System.out.println("Quiza te interese verla mas tarde...");

        }
    }
}
