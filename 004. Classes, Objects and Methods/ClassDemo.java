
//Working with class for the first time, demonstration, initialisation, declaration and accessing the data members

class FirstClass{

    //data members
    String name;
    int RollNum;
    String department;

}


class ClassDemo {

    //creating the object in main method
    public static void main(String[] args) {

        FirstClass student1 = new FirstClass();
        FirstClass student2 = new FirstClass();

        //accessing the variables
        student1.name = "Arun";
        student1.RollNum = 5;
        student1.department = "Technology";

        //we can create any number of objects similarly
        student2.name = "Ram";
        student2.RollNum = 16;
        student2.department = "Technology";

        //printing the first details
        System.out.println("Name: "+student1.name+"\n"+"Roll Num: "+student1.RollNum+"\n"+"Department: "+student1.department);
        System.out.println("\n"+"Name: "+student2.name+"\n"+"Roll Num: "+student2.RollNum+"\n"+"Department: "+student2.department);

    }

}
