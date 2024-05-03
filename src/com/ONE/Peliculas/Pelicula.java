public class Pelicula {

    // NO SE PUSO EL MAIN, DE PONERSE, NO PODRIA SER LLAMADO EN LA CLASE "Principal".


    /******************************* SE INICIALIZAN LOS ATRIBUTOS (VARIABLES) DE LOS METODOS *************************************/
        String nombrePelicula;
        int fechaLanzamiento;
        int duracion;
        double ponderacion;
        int personas=0;

 /***************************************************** METODOS ******************************************************/

 void fichaTecnica() // METODO CON TODOS LOS DATOS DE ARRIBA(reduce lineas de codigo al llamarla en la Clase Principal)
     {
        System.out.println("Mi Pelicula es: "+ nombrePelicula);
        System.out.println("Fecha de lanzamiento:" + fechaLanzamiento);
        System.out.println("Duracion:" + duracion);

    }

    /** SE HARA UNA SUMA CON LOS VALORES INTERNOS: */

    void suma( double a){
      ponderacion=ponderacion+a;
      personas++;

    }

    double promedio(){  //PROMEDIAR LAS EVALUACIONES
     return ponderacion/personas;
    }
}

