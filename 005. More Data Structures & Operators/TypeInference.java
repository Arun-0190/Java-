public class TypeInference {

    //We'll see how we use var with local variables

    public static void main(String[] args) {

        var avg = 10.00;                //use of var to infer type of avg
        System.out.println("Value of avg is: " + avg);

        //var being simply a user defined variable name
        int var = 10;
        System.out.println("Value of var: " + var);

        //using var as both variable and the declaration
        var k = -var;
        System.out.println("Value of k is: " + k);

    }

}
