package com.ONE.Peliculas;

public class Titulo {

    // NO SE PUSO EL MAIN, DE PONERSE, NO PODRIA SER LLAMADO EN LA CLASE "Principal".


    /******************************* SE INICIALIZAN LOS ATRIBUTOS (VARIABLES) DE LOS METODOS *************************************/
    private  String nombreSP;

    //      int fechaLanzamiento; Asi estaban originalmente declaradas las variables.
    private int fechaLanzamiento;
    //Se transformaron a publicas y privadas como ejercicio. En modo publico ya se puede acceder desde (PELICULA)
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



    /******************** METODO PARA DEVOLVER PERSONAS ********************/

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


