import java.io.IOException;                 //for handling exceptions

public class TakingInputs {

    //program to take any inputs from keyboard          *we can also use scanner class*
    public static void main(String[] args) throws IOException {

        char c;
        //for character input
        System.out.print("Press any character or letter: ");
        c = (char) System.in.read();
        System.out.println("Your character is: "+c);
        System.out.println();
    }

}
