public class GallonsLiters {

    public static void main(String[]args) {

        // 1 Gallon = 3.78541 Liters

        double gallons, liters;
        int counter;

        counter = 0;

        for (gallons = 1; gallons <= 97; gallons = gallons+4) {//for loop to go through 100 gallons
            liters = gallons * 3.78541; //conversion to liters
            System.out.println(liters + " Liters = " + gallons + " Gallons");



            counter++;


            if (counter == 5) {
                System.out.println("");
                counter = 0; //resets the counter

            } if (gallons == 1) {
                System.out.println(liters+ " Liters = " + gallons + " Gallon");


            }



        }

        System.out.println("We are done !");


    }

}