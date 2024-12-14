//In this we'll see how we can use parameters in a class method

class CheckNum {

    //checks if the number is even or odd
    boolean isEven(int x){
        /*
        if((x%2) == 0) return true;
        return false;
        */
        //or can be done like this too
        return (x%2 == 0);
    }

    //checks the sum
    int sum(int a, int b){
        return a+b;
    }

}

public class UsingParameters {

    public static void main(String[] args) {

        CheckNum e = new CheckNum();

        if(e.isEven(10)) System.out.println("10 is even");
        if(e.isEven(9)) System.out.println("9 is even");
        if(e.isEven(8)) System.out.println("8 is even");

        //using another function
        System.out.println("Sum of 10 and 19 is: "+e.sum(10, 19));
        System.out.println("Sum of 20 and 39 is: "+e.sum(20, 39));

    }

}
