class MyClass{

    private int i;
    MyClass(int k){
        i = k;
    }
    int get_i(){return i;}

    void set_i(int k){if(k >= 0) i = k;}

}

class TypeInference2 {

    public static void main(String[] args) {
        var mc = new MyClass(12);
        System.out.println("Value of i in mc is: "+mc.get_i());

        mc.set_i(69);
        System.out.println("Now current value of i in mc is: "+mc.get_i());

    }

}
