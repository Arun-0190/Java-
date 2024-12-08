public class UsingContinue {

    public static void main(String[] args) {

        //using continue to print even numbers from 0 to 100
        for(int i = 0; i <= 100; i++){
            if(i%2 != 0) continue;
            System.out.println(i);
        }

        //using continue with labels
        outerloop:
            for(int i =0; i <= 10; i++){
                System.out.print("\nOuter loop pass: "+i+", Inner loop: ");

                for(int j = 0; j <= 10; j++){
                    if(j == 5) continue outerloop;
                    System.out.print(j+" ");
                }
            }
    }
}
