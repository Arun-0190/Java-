
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
        System.out.println("\nName: "+student1.name+"\n"+"Roll Num: "+student1.RollNum+"\n"+"Department: "+student1.department);
        System.out.println("\nName: "+student2.name+"\n"+"Roll Num: "+student2.RollNum+"\n"+"Department: "+student2.department);


        //understanding the concept of reference variables and assignment
        FirstClass student3 = new FirstClass();
        FirstClass student4 = student3;         //now student 3 and 4 refers to same object
        FirstClass student5 = new FirstClass();
        student5 = student4;                        //4 and 5 refers to same object

        student3.name = "Shyam";
        student3.RollNum = 18;
        student3.department = "Electrical";

        System.out.println("\nName: "+student4.name+"\n"+"Roll Num: "+student4.RollNum+"\n"+"Department: "+student4.department);
        //even when the elements of student 4 were not directly provided but, we can access it directly

        System.out.println("\nName: "+student5.name+"\n"+"Roll Num: "+student5.RollNum+"\n"+"Department: "+student5.department);


    }

}
