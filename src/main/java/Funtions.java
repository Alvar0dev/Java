public class Funtions {
    public static void main(String[] args) {
        String myName ="Alvaro";
        buildPersonaInformation (myName,30); //2 argumentos o parametros;
        System.out.println("Programa terminado" + buildPersonaInformation("Alvaro",30));
    }
    public static String buildPersonaInformation (String personName, int personAge){//*necesita 2 parametros or argumentos
        //public pueden usarse las funciones en todas las clases del proyecto
        //private es que solo se puede usar dentro la clase Funtions
        //protected se pueden usar dentro del paquete (java) en todas las clases. // Si no ponemos nada , por defecto es PROTECTED
       return "Hola estoy imprimiento la funcion y me llamo " + personName+" y tengo "+personAge;
    }
}
