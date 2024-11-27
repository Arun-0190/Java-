public class casting {

    //using typecasting
    public static void main(String[] args) {

        for(int i = 1; i<=5; i++){
            System.out.println(i+"/3 in integer = "+i/3);
            System.out.println(i+"/3 in fractions = "+ (double)i/3);                //casted to higher data type
            System.out.println();
        }
    }
}
