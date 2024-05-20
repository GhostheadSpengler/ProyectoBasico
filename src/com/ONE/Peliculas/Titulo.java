package com.ONE.Peliculas;

import com.google.gson.annotations.SerializedName;

public class Titulo {

    // NO SE PUSO EL MAIN, DE PONERSE, NO PODRIA SER LLAMADO EN LA CLASE "Principal".


    /******************************* SE INICIALIZAN LOS ATRIBUTOS (VARIABLES) DE LOS METODOS *************************************/
    @SerializedName("Title") //Se hizo esta anotacion para poder convertir la informacion de la Api OMDB, a las necesidades del codigo. En este caso se adapta el "Title" de la Api, al nombreSP de este codigo
    private  String nombreSP;

    //      int fechaLanzamiento; Asi estaban originalmente declaradas las variables.

    @SerializedName("Year")
    private int fechaLanzamiento;
    //Se transformaron a publicas y privadas como ejercicio. En modo publico ya se puede acceder desde (PELICULA)

    @SerializedName("Runtime")
    public int duracion;
    private double ponderacion;
    private int personas=0;
    /******************** METODO PARA RECIBIR FECHA LANZAMIENTO ********************/

    public void setFechaLanzamiento(int fechaLanzamiento){ this.fechaLanzamiento = fechaLanzamiento;}

    /******************** METODO PARA RECIBIR INFO  ********************/

    /*Ya que es una instancia privada, no se puede  recibir informacion externa, es por ello que igualmente se hace uso de un metodo (GETTER) para asi obtener los datos*/
    public void setNombreSP(String nombrePelicula) {
        this.nombreSP = nombrePelicula;
    }

    public String getNombreSP() {
        return nombreSP;
    }

    /******************** GETTER PARA DEVOLVER PERSONAS ********************/

   /* Al haberse convertido en una instancia privada, el usuario no podra acceder directamente al metodo "PERSONAS", por lo que unicamente devolvera el resultado por medio del nuevo metodo creado.

    Esto modificara el codigo de llamado en la clase (PRINCIPAL)*/

    public int getPersonas() {
        return personas;
    }


    /******************** METODO PARA DEVOLVER PONDERACION ********************/

    public double getPonderacion() {
        return ponderacion;
    }

    /******************** METODO PARA DEVOLVER DURACION EN MINUTOS ********************/

    public int getDuracion() {
        return duracion;
    }

    /****************************** METODOS ****************************/

    public void fichaTecnica() // METODO CON TODOS LOS DATOS DE ARRIBA(reduce lineas de codigo al llamarla en la Clase Principal)
         {
        System.out.println("Titulo: "+ nombreSP);
        System.out.println("Fecha de lanzamiento:" + fechaLanzamiento);
        System.out.println("Duracion:" + duracion);

        }
     public void fichaSerie(){
         System.out.println("Titulo Serie:" + nombreSP);
         System.out.println("Fecha de estreno:" + fechaLanzamiento);
     }

    public void suma(double pondera){
        ponderacion= ponderacion + pondera;
        personas++;
    }

    public double promedio(){
        return ponderacion/personas;
    }



// SE CREA UN TO STRING, PARA QUE SE PUEDA SOBREESCRIBIR (REEMPLAZAR) LA INFORMACION DE LA API con este CODIGO (alt+ insert)
    @Override
    public String toString() {
        return //"Titulo{" +
                "nombreSP='" + nombreSP + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", duracion=" + duracion /*+*/
                /*'}'*/;
    }
}

//    /** SE HARA UNA SUMA CON LOS VALORES INTERNOS: */
//

//
////    public void suma( double a){
////        ponderacion= ponderacion+a;
////        personas++;
////
////    }
//
//    public double promedio(){  //PROMEDIAR LAS EVALUACIONES
//        return ponderacion/personas;
//    }


