public class Galtolit2 {

    //this program displays conversion table of gallons to liters
    //leaving a line space after every 10 counts
    public static void main(String[] args) {
        int counter;
        double gallons, liters;

        counter =0;

        for(gallons = 1; gallons<=100; gallons++){

            liters = gallons * 3.78541;
            System.out.println(gallons+" Gallons is = "+liters+" liters");

            counter++;
            //for every 10 line
            if(counter == 10){
                System.out.println();
                counter = 0;                    //reset counter to go up to 10 again
            }
        }
    }


}
