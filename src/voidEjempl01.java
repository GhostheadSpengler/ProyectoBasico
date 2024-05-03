public class voidEjempl01 {
    int suma;
    //public void suma(int a, int b){
    // Los parametros a & b recibiran argumentos (valores), no recibe return.
      public int suma(int a,int b) { //Recibe return
          suma = a + b;
        return suma; //En un void, no es posible solicitar el retorno de algun resultado.

//  2)       System.out.println("El resultado es: " + suma);
          //}

      }
}

/*READ: Para que acepte sumar argumentos, es decir, interactuar mas alla del resultado que entrega este metodo al ser llamado en la clase (voidPrincipal02), es necesario cambiar el el "void" por el tipo que se espera recibir en la clase que lo invoca.

Se eliminara el println() y se pondra: return nombreMetodo.

Void solo devuelve resultados y operaciones internas, no se puede ocupar para ninguna otra operacion y o interaccion. Es decir, no se almacena.

REVISAR VIDEO DE LA EXPLICACION AL USO VOID y RETURN: https://www.youtube.com/watch?v=FPhRX73jP28
*/

