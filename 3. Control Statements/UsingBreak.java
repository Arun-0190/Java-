public class UsingBreak {

    //using break to exit loops and also using it as a form of goto

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop count: " + i);
            System.out.print("\tInner loop count: ");

            int t = 0;
            while (t <= 10) {
                if (t == 10) break;                   //terminating the loop if t is 10
                System.out.print(t + " ");
                t++;

            }
            System.out.println();
        }
        System.out.println("Loops Complete..");


        //using break as a form of goto
        for (int i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        //this is never reached
                        System.out.println("Won't print");
                    }
                    System.out.println("After block three");
                }
                System.out.println("After block two");
            }
            System.out.println("After block one");
        }
        System.out.println("After for");
        System.out.println();

        //analysing different positions of break label

        //1. using label before for loop
        stop1:
        for (int x = 0; x <= 5; x++) {
            for (int y = 0; y <= 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();

        //using label after for loop
        for (int x = 0; x <= 5; x++) {
            stop2:
            {
                for (int y = 0; y <= 5; y++) {
                    if (y == 2) break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }

        }

    }
}
