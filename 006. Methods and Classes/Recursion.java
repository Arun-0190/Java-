public class Recursion {

    //recursive factorial
    public static double FactR(int i){

        double result=1;

        if(i < 0) {
            throw new RuntimeException("Not a valid number for taking factorial.");
        }else{
            if(i == 1) return 1;

            result = FactR(i-1)*i;

        }


        return result;

    }

    //iterative
    public static double FactI(int i){

        double result=1;

        if(i < 0) {
            throw new RuntimeException("Not a valid number for taking factorial.");
        }

        for(int t = 1; t<=i; t++){

            result *= t;

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Using Recursive method: ");
        System.out.println("Factorial of 5: "+FactR(5));
        System.out.println("Factorial of 10:"+FactR(10));
        System.out.println("Factorial of 100: "+FactR(100));
        System.out.println("Factorial of 10000:"+FactR(10000));
        System.out.println("\nUsing Iterative method:");
        System.out.println("Factorial of 6: "+FactI(6));
        System.out.println("Factorial of 69: "+FactI(69));
        System.out.println("Factorial of 169: "+FactI(169));
        System.out.println("Factorial of 9699: "+FactI(9699));
    }

}
