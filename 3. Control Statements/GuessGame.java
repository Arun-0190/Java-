import java.io.IOException;

public class GuessGame {

    public static void main(String[] args) throws IOException {

        char ch, ignore, answer = 'K';

        do{
            System.out.println("Am thinking of a letter between A to Z.");
            System.out.print("Can you guess it(only capital letters): ");

            //read the character
            ch = (char) System.in.read();

            System.in.read();                       //consume the newline character

           if(ch == answer) System.out.println("**Yeahh!! You found it!!!**");
           else{
               System.out.println("...Sorry you're ");
               if(ch < answer) System.out.println("too low.");
               else System.out.println("too high.");
               System.out.println("Try Again!\n");
           }
        }while(answer != ch);
    }

}
