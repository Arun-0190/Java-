public class NestedIfs {

    public static void main(String[] args) {

        int a = 50, b = 40, c = 30;

        //nested if's to compare the greatest integer
        if(a > b){

            //2nd if statement
            if(a > c){
                System.out.println("A is the greatest.");
            }else{
                System.out.println("C is greatest.");
            }
        }else{
            //2nd if statement again
            if(b > c){
                System.out.println("B is greatest.");
            }else{
                System.out.println("C is greatest.");
            }
        }

    }

}
