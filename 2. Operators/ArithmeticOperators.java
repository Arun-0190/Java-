public class ArithmeticOperators {

    public static void main(String[] args) {

        //basic arithmetic operators

        double a = 10;
        double b = 7;
        System.out.println("a: "+a+"\nb: "+b);

        //sum
        double sum = a+b;
        System.out.println("Sum is: "+sum);

        //diff
        double diff = a-b;
        System.out.println("Diff is: "+diff);

        //multiply
        double product = a*b;
        System.out.println("Product is: "+product);

        //division
        double division = a/b;
        System.out.println("Division is: "+division);

        //modulus
        double mod = a % b;
        System.out.println("Modulus is: "+mod);

        //increment and decrement
        a++;    b--;
        System.out.println("a+1: "+a+"\nb-1: "+b);

        //shorthand assignments
        a+=10;
        b-= 5;
        System.out.println("a+=10: "+a+"\nb-=5: "+b);

        a /= 2;
        b *= 2;
        System.out.println("a/=2: "+a+"\nb*=2: "+b);

    }

}
