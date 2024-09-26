public class Estructuras_de_Control {

    public static void main(String[] args) {
        boolean isAdult = false;
        if (isAdult == true) {
            System.out.println("El usuario es adulto");
        } else {
            System.out.println("El usuario es menor de edad");
        }


// && - AND
//|| - OR
//! - NOT
// == EQUALS
// < MINUS THAT
//> MAYOR THAT
//>= MAYOR OR EQUALS THAT
//<=MINUS OR EQUALS THAT


/*
Salario anual es mayor a 100.000 ->le damos el prestamo
Salario anual es mayor a 50.000 y su edad es menor que 30 años ->le damos la mitad prestamo.
 */

        double salaryPerYear = 50_000;
        int age = 34;

        if (salaryPerYear >= 100_000) {
            System.out.println("Te damos el prestamo completo");
        } else if (salaryPerYear >= 50_000 && age >= 30) {
            System.out.println("Te damos el 50% del prestamo");
        } else {
            System.out.println("No se te puede conceder el prestamo");
        }
    }
}