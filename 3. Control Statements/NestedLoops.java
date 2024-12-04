public class NestedLoops {

    //program to demonstrate the nested loops finding the factors of numbers from 2 to 100
    public static void main(String[] args) {

        for(int i = 2; i <= 100; i++){

            System.out.print("Factors of "+i+": ");

            //inner loop
            for(int j = 2; j < i; j++){

                //checking the condition
                if(i%j == 0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
