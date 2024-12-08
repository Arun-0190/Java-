public class ElseIfLadder {

    public static void main(String[] args) {

        //Else if ladder in java

        int age = 19;

        if(age > 13 && age < 20){
            System.out.println("You are a Teenager.");
        }
        else if(age >= 20){
            System.out.println("You are an Adult.");
        }
        else{
            System.out.println("You are Child.");
        }

    }

}
