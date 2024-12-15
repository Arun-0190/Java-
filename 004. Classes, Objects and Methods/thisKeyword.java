//In this we'll see how to use this keyword
class Pwr{

    double b;
    int e;
    double val;

    Pwr(double b, int e){

        this.b = b;
        this.e = e;                 //here this refers to e instance, not the parameter

        this.val = 1;
        if(e == 0) return;
        for(; e> 0; e--) val = val*b;

    }

    double getVal(){

        return this.val;

    }
}

class thisKeyword {

    public static void main(String[] args) {

        Pwr P1 = new Pwr(5,4);
        Pwr P2 = new Pwr(4,5);

        System.out.println(P1.b + " raised to the power "+P1.e+" is: "+P1.getVal());
        System.out.println(P2.b + " raised to the power "+P2.e+" is: "+P2.getVal());

    }

}
