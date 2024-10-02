import java.util.Scanner;

public class AverageCalculatorBucle {

    public static void main(String[] args) {
        System.out.println("Bienvenido al calculador de medias...");

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[3];

        for (int i=0; i<3; i++){
            System.out.println("Introduce el numero de la posicion " + (i+1));
            numbers[i] = sc.nextDouble();
        }

        /* Otra forma de hacerlo seria:
        double sum = 0
        for (double number : numbers){
        sum = sum+number;
        }
        * */

        System.out.println("Calculando la media... ");
        double result = AverageCalculator(numbers);

        System.out.println("El resultado es... " + result);
    }
    public static double AverageCalculator(double[]numbers){//
        return(numbers[0]+numbers[1]+numbers[2])/ numbers.length;
    }
}
