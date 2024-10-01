public class Bucles {

    public static void main(String[] args) { //en los contadores de buckles suele usarse i j k l por ese orden
       int number =5;
        for (int i=1; i<=3 ; i++ ){
            number = number * number;
            System.out.println("El resultado es: "+ number);
        }
        String[] names ={"Alvaro","Arturo","Carlos"};

        for (int i=0; i<names.length; i++){
            ;
            System.out.println("Los nombres son : "+ names[i]);}

        boolean isRaining = true;
        int i = 0;

        while(isRaining) {
            System.out.println("Is raining");
            if (i ==10) {
                break;
            }
            i++;
        }

        double vehiculeSpeed = 0.0;
        double speedLimit = 100.0;

        while (vehiculeSpeed < speedLimit) {
            vehiculeSpeed+=12.5;
            System.out.println("El vehiculo va a "+ vehiculeSpeed +"km");
        }
    }



}

