import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Establece un entrada de dato por la consola que se llama sc
        System.out.println("Introduce un numero");

        Double firstNumber = sc.nextDouble();// Registra como firstNumber la entrada por consola sc.(siguiente)con el parametro obligado de Double()
        System.out.println("Introduce un numero");
        System.out.println("El numero recibido es " +firstNumber);
        Double secondNumber = sc.nextDouble();
        System.out.println("El numero recibido es " +secondNumber);

    }

}
