import java.io.IOException;

public class JavaBasicHelpSystem {

    //A program to help user for basic if else, traditional switch case and for loop syntaxes

    public static void main(String[] args) throws IOException {

        System.out.println("Help Desk: ");
        System.out.println("\t1. if Syntax");
        System.out.println("\t2. for loop Syntax");
        System.out.println("\t3. switch case Syntax");
        System.out.print("\t Choose any one: ");

        char c = (char) System.in.read();

        switch(c){
            case '1':
                System.out.println("The if syntax: \n");
                System.out.println("if(condition){");
                System.out.println("\tstatement");
                System.out.println("}");
                System.out.println("else{");
                System.out.println("\tstatement");
                System.out.println("}");
                break;

            case '2':
                System.out.println("The for loop syntax: \n");
                System.out.println("for (start condition ; end condition; increment or decrement){");
                System.out.println("\ttask to perform...");
                System.out.println("}");
                break;

            case '3':
                System.out.println("The traditional switch case syntax:\n");
                System.out.println("switch(expression) {");
                System.out.println("\t case constant:");
                System.out.println("\t\tstatement sequence...");
                System.out.println("\t\tbreak;");
                System.out.println("\t//different case.....");
                System.out.println("\tIf want then default case too.");
                System.out.println("}");
                break;

            default:
                System.out.println("Selection not found!!!");
        }

    }

}
