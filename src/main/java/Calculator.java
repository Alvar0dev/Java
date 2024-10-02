import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Establece un entrada de dato por la consola que se llama sc
        System.out.println("Introduce un numero");

        double firstNumber = sc.nextDouble();// Registra como firstNumber la entrada por consola sc.(siguiente)con el parametro obligado de Double()
        System.out.println("El numero recibido es " + firstNumber);
        System.out.println("Introduce un numero");

        double secondNumber = sc.nextDouble();
        System.out.println("El numero recibido es " + secondNumber);

        System.out.println("El primer numero recibido es " + firstNumber);
        System.out.println("El segundo numero recibido es " + secondNumber);

        System.out.println("Introduzca operacion");
        String operation = sc.next();
        System.out.println("La operacion es" + operation);

       double result= doCalculation(firstNumber,secondNumber,operation);

       System.out.println("El resultado de la operacion es "+ result);
    }

    private static double doCalculation(double firstNumber, double secondNumber, String operation) {
        switch (operation) {
            case "+":
                return sum(firstNumber, secondNumber);
            case "-":
                return minus(firstNumber, secondNumber);
            case "*":
                return multiply(firstNumber, secondNumber);
            default:
                System.out.println("Operacion no conocida");
                return -1;
        }
    }

    public static double sum(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    public static double minus(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    public static double multiply(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }
}