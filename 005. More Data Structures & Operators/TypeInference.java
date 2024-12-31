public class TypeInference {

    public static void main(String[] args) {

        //We'll see how we use var with local variables

        var avg = 10.00;                //use of var to infer type of avg
        System.out.println("Value of avg is: " + avg);

        //var being simply a user defined variable name
        int var = 10;
        System.out.println("Value of var: " + var);

        //using var as both variable and the declaration
        var k = -var;
        System.out.println("Value of k is: " + k);

        //using var to declare an array
        var myArray = new int[10];              //valid

        //var[] myArray = new int[10];                //not valid
        //var myArray[] = new int[10];                //not valid

        //we don't need brackets on the left side of the initialization of an array while with var

        var myArray1 = new int[]{1, 2, 3, 4, 5};                //valid this way

        //var always needs variable initialization otherwise it won't work
        //var counter;                  //invalid


    }

}
