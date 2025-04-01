class OverConst{

    int x;

    //Default
    OverConst(){
        System.out.println("Inside the default constructor.");
        x = 0;

    }

    OverConst(int i){

        System.out.println("Inside the first parameterised constructor.");
        x = i;

    }

    OverConst(double d){
        System.out.println("Inside the second parameterised constructor.");
        x = (int)d;
    }

    OverConst(int i, int j){
        System.out.println("Inside the third parameterised constructor.");
        x = i*j;
    }

    OverConst(OverConst ov){                    //constructed one object from another

        System.out.println("Inside the fourth constructor.");
        x = ov.x;
    }

}

public class ConstructorOverloading {

    public static void main(String[] args) {

        OverConst ov1 = new OverConst();
        OverConst ov2 = new OverConst(5);
        OverConst ov3 = new OverConst(56.9);
        OverConst ov4 = new OverConst(4,6);
        OverConst ov5 = new OverConst(ov3);

        System.out.println("ov1.x: "+ov1.x);
        System.out.println("ov2.x: "+ov2.x);
        System.out.println("ov3.x: "+ov3.x);
        System.out.println("ov4.x: "+ov4.x);
        System.out.println("ov5.x: "+ov5.x);

    }

}
