//In this we will improve and implement our previous help desk using classes and methods

import java.io.IOException;

class Help{

    //making a function in which we show them the menu
    void showMenu(){

        System.out.println("Help Desk: ");
        System.out.println("\t1. if Syntax");
        System.out.println("\t2. for loop Syntax");
        System.out.println("\t3. while loop Syntax");
        System.out.println("\t4. do-while loop Syntax");
        System.out.println("\t5. switch case Syntax");
        System.out.println("\t6. break Syntax");
        System.out.println("\t7. continue Syntax");
        System.out.println("\tQ. quit");
        System.out.print("\t Choose any one: ");

    }

    //Checking if the given value is valid according to the given options or not
    boolean isValid(int ch){

        return !(ch < '1' | ch > '7' & ch != 'Q');

    }

    //make a function to help
    void helpOn(int what) {

        switch (what) {
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
                System.out.println("The while loop syntax: \n");
                System.out.println("while(given condition is true){");
                System.out.println("\t//task to perform if condition is true...");
                System.out.println("}");
                break;

            case '4':
                System.out.println("The do-while loop syntax: \n");
                System.out.println("do {");
                System.out.println("\ttasks to perform...");
                System.out.println("} while (condition);");
                break;

            case '5':
                System.out.println("The traditional switch case syntax:\n");
                System.out.println("switch(expression) {");
                System.out.println("\t case constant:");
                System.out.println("\t\tstatement sequence...");
                System.out.println("\t\tbreak;");
                System.out.println("\t//different case.....");
                System.out.println("\tIf want then default case too.");
                System.out.println("}");
                break;

            case '6':
                System.out.println("The break syntax:\n");
                System.out.println("break; or break label;");
                break;

            case '7':
                System.out.println("The continue syntax:\n");
                System.out.println("continue; or continue label;");
                break;

        }

    }

}

class ImprovedHelpDesk {

    public static void main(String[] args) throws IOException {

        char choice, ignore;
        Help helpobject = new Help();

        for(;;){

            do{
                helpobject.showMenu();

                choice = (char) System.in.read();

                do{
                    ignore = (char) System.in.read();

                }while( ignore != '\n');

            }while( !helpobject.isValid(choice));

            if(choice == 'Q') break;

            helpobject.helpOn(choice);

            System.out.println("\n");

        }

    }

}
