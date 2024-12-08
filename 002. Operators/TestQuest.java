public class TestQuest {

    //printing prime numbers between 1 and 1000
    public static void main(String[] args) {

        int i, j;
        boolean isprime;

        //running a loop for including all numbers
        for(i = 2; i <= 1000; i++){

            isprime = true;

            //if the number is evenly divisible by any number, can also use directly j < i
            for(j = 2; j < i; j++) {

                //condition to check if it has mod 0
                if ((i % j) == 0) isprime = false;
            }

                //if false then
            if(isprime){
                    System.out.println(i+" is a prime number.");
            }
        }
    }
}
