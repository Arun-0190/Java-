public class TheForloop {

    //seeing the for loop and it's various variations

    public static void main(String[] args) {

        //normal version
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println();

        //with commas
        for(int i = 0, j = 10; i<=j; i++, j--){
            System.out.println("i and j: "+i+"  "+j);
        }
        System.out.println();

        //with missing pieces
        for(int i = 0; i<=5;){
            System.out.println(i);
            i++;
        }
        System.out.println();
        //and
        int i = 0;
        for( ; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println();

        //infinite loop
        /*
        for( ; ; ){
            //...
        }
         */

        //with no body
        int sum = 0;
        for(i = 1; i<=5; sum+=i++);
        System.out.println("sum = "+sum);

    }
}
