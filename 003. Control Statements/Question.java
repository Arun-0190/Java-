import java.io.IOException;

public class Question {

    //a program to take input from user, if it's uppercase converts to lower case, and if it's lowercase converts to uppercase

    public static void main(String[] args) throws IOException {

        char c;
        int count = 0;

        System.out.println("Type period(.) to exit: ");
        do{
            c = (char) System.in.read();
            if(c >= 'A' & c<= 'Z'){
                c += 32;
                System.out.println(c);
                count++;
            } else if (c >= 'a' & c <= 'z') {
                
                c -= 32;
                System.out.println(c);
                count++;
                
            }
            
        }while(c != '.');
        System.out.println("Number of times it's converted: "+ count);

    }

}
