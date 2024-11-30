import java.io.IOException;

public class SwitchCase {

    //Identifying different special characters using Switch case statements
    public static void main(String[] args) throws IOException {

        System.out.print("Enter the special character: ");
        char sign = (char) System.in.read();

        switch(sign){

            //case 1
            case '!':
                System.out.println("It's an exclamation mark.");
                break;

            //case 2
            case '@':
                System.out.println("It's an at sign.");
                break;

            //case 3
            case '#':
                System.out.println("It's a hash sign.");
                break;

            //case 4
            case '$':
                System.out.println("It's a dollar sign.");
                break;

            //case 5
            case '&':
                System.out.println("It's a ampersand sign.");
                break;

            //default case
            default:
                System.out.println("Any sign did not matched.");
        }

    }
}
