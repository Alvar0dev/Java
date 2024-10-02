import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Establece un entrada de dato por la consola que se llama sc;
        System.out.println("Introduce los 3 numeros para hacer la media");
        double firstNumber = sc.nextDouble();// Registra como firstNumber la entrada por consola sc.(siguiente)con el parametro obligado de Double()
        System.out.println("El numero recibido es " + firstNumber);
        System.out.println("Introduce un numero");

        double secondNumber = sc.nextDouble();
        System.out.println("El numero recibido es " + secondNumber);

        double threeNumber = sc.nextDouble();
        System.out.println("El numero recibido es " + threeNumber);

        System.out.println("El primer numero recibido es " + firstNumber);
        System.out.println("El segundo numero recibido es " + secondNumber);
        System.out.println("El segundo numero recibido es " + threeNumber);


        System.out.println("Calculando...");

        double result = AverageCalculator(firstNumber,secondNumber,threeNumber);
        System.out.println("El resultado de la media de los 3 numeros es " + result);


    }
    public static double AverageCalculator(double firstNumber, double secondNumber, double threeNumber){
        return (firstNumber+secondNumber+threeNumber)/3;

    }
}
