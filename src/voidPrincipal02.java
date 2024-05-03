public class voidPrincipal02 {
    public static void main(String[] args) {
        voidEjempl01 metodoVoid= new voidEjempl01(); //se crea el objeto
        int almacena;
        metodoVoid.suma(4,5); //se llama al metodo y se le pasan los argumentos
        almacena=metodoVoid.suma;
        System.out.println("El resultado de la suma es: " + almacena * 2);


    }
}

//Es posible interactuar con el resultado devuelto (9)*2 porque se desactivo el void. De haber estado el metodo con el void activado, solo se recibe el 9 y ya. No se almacena ni nada.