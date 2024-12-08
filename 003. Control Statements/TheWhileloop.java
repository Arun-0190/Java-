public class TheWhileloop {

    public static void main(String[] args) {

        //printing the english alphabets using while loop as well as counting the number of letters
        char ch = 'A';
        int count =0;

        while(ch <= 'Z'){
            System.out.print(ch+"  ");
            ch++;
            count++;

        }
        System.out.println("\nTotal number of English alphabets: "+count);

        //printing hindi alphabets from अ to ह as well as counting the letters
        System.out.println();
        char cha = 'अ';
        count = 0;

        while(cha <= 'ह'){

            System.out.print(cha+"  ");
            cha++;
            count++;

        }
        //since the last three are the combination of characters in hindi so they are not characters so can't be printed by while loop
        System.out.print("क्ष  "+"त्र  "+"ज्ञ");
        System.out.println("\nTotal number of letters(or characters) in Hindi Varnmala: "+(count+3));



        //while loop using with for loop
        int e;
        int result;

        for(int i = 0; i <= 10; i++){
            result = i;
            e = i;

            //multiplying that much time inside the loop for required result
            while(e > 0){
                result *= 2;
                e--;
            }
            System.out.println("2 to the power "+i+" is "+result);
        }

    }

}
