
//Working with methods, creating and using it in the class

class SecondClass {

    //data members
    String name;
    int RollNum;
    String department;

    public void display(){
        System.out.println("\nName: "+name+"\nRoll Number: "+RollNum+"\nDepartment: "+department);
    }

}


class ClassMethods {

    //creating the object in main method
    public static void main(String[] args) {

        SecondClass student1 = new SecondClass();
        SecondClass student2 = new SecondClass();
        SecondClass student3 = new SecondClass();

        //accessing the variables
        student1.name = "Arun";
        student1.RollNum = 5;
        student1.department = "Technology";

        student2.name = "Ram";
        student2.RollNum = 16;
        student2.department = "Technology";

        student3.name = "Shyam";
        student3.RollNum = 18;
        student3.department = "Electrical";

        //displaying using the function of the class
        student1.display();
        student2.display();
        student3.display();

    }

}

