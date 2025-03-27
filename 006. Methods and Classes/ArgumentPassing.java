class Test1{

    //This cannot change the value in the call
    void noChange(int i, int j){
        i = i+j;
        j = -j;
    }

}

class Test2 {

    int a, b;

    //This method will change the values of the arguments
    Test2(int i, int j){

        a = i;
        b = j;

    }

    //Pass the object: now object used in the call will be changed
    void Change(Test2 ob){

        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }



}

public class ArgumentPassing {

    public static void main(String[] args) {

        Test1 c = new Test1();

        int x = 10, y = 20;

        System.out.println("Call by value: ");
        System.out.println("x and y before the change: "+x+" "+y);

        c.noChange(x,y);

        System.out.println("x and y after the change: "+x+" "+y);


        Test2 d = new Test2(2,20);

        System.out.println("Call by Reference: ");
        System.out.println("x and y before the change: "+d.a+" "+d.b);

        d.Change(d);

        System.out.println("x and y after the change: "+d.a+" "+d.b);

    }

}
