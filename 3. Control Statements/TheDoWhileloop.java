import java.io.IOException;

public class TheDoWhileloop {

    //making a code to demonstrate the working of do-while loop

    public static void main(String[] args) throws IOException {

        char ch;

        do{
            System.out.print("Press a key followed by Enter: ");
            ch = (char) System.in.read();
            System.in.read();               //to consume the newline character
        }while(ch != 'Q');

    }

}
