//The demonstration of default and parameterized constructors
class ConstructorClass{

    int w;
    int x;
    int y;
    int z;

    //constructor without parameters
    ConstructorClass(){

        w = 10;                 //giving value to w directly

    }

    //with one parameter
    ConstructorClass(int i){

        x = i;                      //giving user specific value to x

    }

    //with two parameters
    ConstructorClass(int i, int j){

        y = i;
        z = j;

    }

}

public class Constructors {

    public static void main(String[] args) {

        ConstructorClass CC1 = new ConstructorClass();
        ConstructorClass CC2 = new ConstructorClass(120);
        ConstructorClass CC3 = new ConstructorClass(12,14);

        System.out.println("1st constructor object value: "+CC1.w+"\n2nd constructor object value: "+CC2.x+"\n3rd constructor objects value: "+CC3.y+"  "+CC3.z);

    }

}
