public class ShiftOperators {

    //Using left and right shift operators
    public static void main(String[] args) {

        int val = 1;

        for(int i = 0; i < 8; i++){
            for(int t = 128; t > 0; t = t/2){                   //since we traverse in binary every preceding digit will be half of it

                if((val & t ) != 0) System.out.print("1 ");
                else System.out.print("0 ");

            }
            System.out.println();
            val = val << 1;     //left shift by 1;
        }

        System.out.println();

        val = 128;

        for(int i = 0; i <8; i++){
            for(int t = 128; t > 0; t = t/2){
                if((val & t) != 0) System.out.print("1 ");              //to print the bytes
                else System.out.print("0 ");
            }
            System.out.println();
            val = val >> 1;                 //right shift by 1
        }

    }

}
