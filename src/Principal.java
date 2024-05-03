import com.ONE.Pelicula.calculadora.CalculadoraDeTiempo;
import com.ONE.Peliculas.Pelicula;
import com.ONE.Peliculas.Serie;

public class Principal {

    public static void main(String[] args) {

        //SE INSTANCIA (CREA) MI PROPIO OBJETO, EN BASE A LA CLASE PREVIAMENTE HECHA "pelicula", LA CUAL CONTIENE LOS DATOS QUE SE VAN A LLAMAR  AQUI EN ESTE CODIGO//


//************************ PRIMER OBJETO **********/

        Pelicula filme=new Pelicula(); //Se inicializa y crea el objeto.
               filme.setNombreSP("El Padrino");
               filme.duracion=180;
               filme.setFechaLanzamiento(1970);

//************************ SEGUNDO OBJETO **********/

        Pelicula filmeDos= new Pelicula();
    //      filmeDos.nombrePelicula="The Thing";
            filmeDos.setNombreSP("The Thing");
            filmeDos.setFechaLanzamiento(1983);
            filmeDos.duracion=120;

//****************** LLAMANDO INDIVIDUALMENTE A LOS OBJETOS  *********/

        filme.fichaTecnica(); //El Padrino


//        System.out.println("Mi com.ONE.Peliculas.Pelicula es: "+ filme.setNombrePelicula(),
//        System.out.println("Fecha de lanzamiento:" + filme.setFechaLanzamiento();
//        System.out.println("Duracion:" + filme.duracion);
        Pelicula prom=new Pelicula();
          filme.suma(10);
          filme.suma(8.8); //Aca se da acceso para poner las evaluaciones
          filme.suma(7.9);
          filme.suma(8.0);
          System.out.println("Suma total de evaluaciones" + filme.getPonderacion());
          System.out.println("El total de usuarios que evaluaron es: " + filme.getPersonas());
          System.out.println("El promedio de esta pelicula es:" + filme.promedio());

          System.out.println("\n*******************************\n");

//****************** LLAMANDO CON UN METODO (Metodo de la clase "com.ONE.Peliculas.Pelicula" de nombre: "fichaTecnica") *********/


       filmeDos.fichaTecnica(); //Se reduce a una linea al ,momento de imprimir. THE THING


//******************************** SE HACE EL PROMEDIO DE LA PELICULA EVALUADA/
        Pelicula promedia=new Pelicula();
        filmeDos.suma(7.5);
        filmeDos.suma(10);
        filmeDos.suma(9.8);

//        System.out.println("La suma de las evaluaciones es:" + filmeDos.ponderacion);
        System.out.println("La suma de las evaluaciones es:" + filmeDos.getPonderacion());
//        System.out.println("Total de personas que evaluaron:" + filmeDos.personas);
        /* Al haber cambiado el modo publico a privado, de (PERSONAS), cambia el codigo de llamado al siguiente: getPersonas */

        System.out.println("Total de personas que evaluaron:" + filmeDos.getPersonas());

        System.out.println("El promedio de esta pelicula es: "+ filmeDos.promedio());

        System.out.println("\n*******************************\n");

//**********SE CREA OBJETO DE CLASE SERIE ********************** /

        Serie serie=new Serie(); //objeto creado
        serie.setNombreSP("Law and Order SVU");
        serie.setFechaLanzamiento(1999);
        serie.setTemporadas(25);
        serie.setEpisodioTemp(22);
        serie.setMinEpisodio(60);
        serie.fichaSerie();
        System.out.println("La duracion total en minutos de la serie es "+ serie.getDuracion());

        Serie serieII=new Serie();
        serieII.setNombreSP("Los Soprano");
        serieII.setFechaLanzamiento(1999);
        serie.setTemporadas(4);
        serieII.setEpisodioTemp(19);
        serieII.fichaSerie();

        //**********SE CREA OBJETO P/CALCULADORA TIEMPO **************** /

        //Se hace la suma de minutos: El Padrino + Ley y Orden
        CalculadoraDeTiempo calculadora=new CalculadoraDeTiempo();
        calculadora.incluye(filme);
        calculadora.incluye(serieII);
        calculadora.incluye(serie);
        System.out.println("El tiempo total que requieres para ver el contenido que elegiste es de: "+ calculadora.getTiempoTotal() + "\n minutos");



    }

}
