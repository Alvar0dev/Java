import java.util.Arrays;

public class Variables {
    // metodo main
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        //Imprime el string Hola mundo

        //VARIABLES E IMPRESIONES EN CONSOLA

        String nombrePersona  = "Alvaro";
        //Define la variable con el tipo Sting (nombrePersona) y le da el valor Alvaro
        System.out.println("Hola me llamo: " + nombrePersona);
        // imprime la variable dentro de un string
        char initialNombre = 'J'; //tiene que ser comillas simples para el char
        //Define la variable char /Letra unica/ (initialNombre) y le da el valor de J
        System.out.println(initialNombre);
        int edadPersona = 20; //int = desde - 2,147,483,648 a 2,147,483,648 // limite de numero grande
        System.out.println("Hola me llamo "+nombrePersona+ " tengo "+edadPersona+" y mi letra favorita es "+ initialNombre);
        long numeroTelefono = 655397061; //numeros grandes /LONG/
        double precioEnUsd = 54.60; //mejor precision pero menos optimizacion
        float precioEnUsdf = 54.40f;
        boolean esMayorDeEdad = true;

        // ARRAYS

        String myArray[];

        myArray = new String[3];

        myArray[0]= "Alvaro";
        myArray[1]= "Miyhumi";
        myArray[2]= "Bartolo";

        for (int i = 0; i < 3; i++) {
            System.out.println(myArray[i]);
            //imprimir todos los indices de un array
        }

        // MATRICES (ARRAYS DE ARRAYS)

        String myMatrix[][] = {
                {"Pedro","Madrid"},
                {"Arturo","Barcelona"},
                {"Miguel","Valencia"}
        };

        System.out.println(myMatrix[1][1]);
    }
}
