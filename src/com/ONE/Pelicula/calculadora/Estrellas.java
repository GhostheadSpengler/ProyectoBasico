package com.ONE.Pelicula.calculadora;

/*La "interface", es como un requerimiento -contrato- que al ser llamado por la clase a traves de "implements". Es como unicamente va a funcionar esta estructura. Tanto la clase que le llama, como la 'interface' misma. */

public interface Estrellas {
    int getEstrellas();
}

//NOTA; Este implement, solo se esta usando como un ejemplo para conocer la utilidad de los IMPLEMENTS. Asi mismo, este se relaciona  con las siguinetes clases: Pelicula y  Titulo (por el promedio).

//NOTA II: Tambien se usa en Episodio.