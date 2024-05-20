import com.ONE.Peliculas.Titulo;
import com.ONE.Peliculas.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ingresaPelicula= new Scanner(System.in);
        System.out.println("Escribe el nombre de la pelicula que deseas ver: ");
        var busqueda= ingresaPelicula.nextLine();

        String direccion= "https://www.omdbapi.com/?t=" + busqueda + "&apikey=c66d742f";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion)) //Es la key que se produjo del ombd.Y se entrego el link desde (Postman)
            .build();

    //No es posible crear objetos como se suele hacer, hay una sintaxix particular. Igual se encuentra la informacion en Java Request Response

    HttpResponse<String> response = client //Se importan las clases HttpResponse
       .send(request, HttpResponse.BodyHandlers.ofString());

        String json= response.body(); // (b) Y se cre una variable donde se guarde el response.body

        System.out.println(json);


    //System.out.println(response.body()); //(a) Se crea el response.body . (c) Y se reemplaza el response.body con el nuevo nombre de la variable json. EJEMPLO ORIGINAL, el modificado esta arriba de este.

    //**************** SE CREA EL OBJETO GSON *********************

        //Se descargo la libreria .jar desde Maven, para poder convertir los datos de la api de OMDB de formato JSON, a un formato clase, que pueda adaptarse a Java

       // Gson gson= new Gson(); OPCION ORIGINAL SIN EL POLICY

        Gson gson= new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

    //gson.fromJson(json, Titulo.class); //Se llama a la clase con la que se va a fusionar esta clase. Y TAMBIEN se crea el nombre que ha de usar este metodo. Abajo es como debe quedar:


   //*** Opcion sin la clase OMDB (OBJETO-A)

        //Titulo miTitulo= gson.fromJson(json, Titulo.class);

   //*** Opcion sin la clase OMDB (Guardando Objeto A en variable)

        //Titulo miTitulo = gson.fromJson(json, Titulo.class);
        //System.out.println("Titulo: "+ miTitulo.getNombreSP());

   //*** Opcion con la clase (record) TituloOmdb (OBJETO-B)
        TituloOmdb tituOmdb= gson.fromJson(json,TituloOmdb.class);


   //*** OPCION A (imprimiendo)
        //System.out.println(miTitulo);

    //*** OPCION B (imprimiendo)
        System.out.println(tituOmdb);



        //NOTA: Se debe permtir que las variables declaradas y las importadas de la base de datos de OMDB, coincidan con el nombre de las variables locales de este programa. Eso se logra con: @SerializedName(se pone esto en la clase Titulo, arriba de cada variable a convertir. Ir a la clase mencionada) **Esta accion se hizo SOLO COMO EJEMPLO, antes de crear el record (clase )TituloOmdb. USAR entonces la clase record TituloOmdb


    }

}

//SE IMPORTARON LAS CLASES CON: ALT + ENTER(Poniendo el puntero antes del Http).

// SE COPIARON LOS DATOS HttpClient DE LA DOCUMENTACION DE JAVA OFICIAL: https://acortar.link/bcKyDE

//NOTA: Hubo problemas al identificar el String de TituloOmdb, por el UPPERCASE, ya que estan declaradas en minusculas (como deben declararse las variables). Sin embargo en el OMDB, estan declaradas las etiquetas en Mayusculas. Debe entonces importarse desde: https://github.com/google/gson/blob/main/UserGuide.md#json-field-naming-support --->> (new GsonBuilder().setFieldNamingPilicy)