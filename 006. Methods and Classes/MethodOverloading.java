public class MethodOverloading {

    public static int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public double sum(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading MO = new MethodOverloading();
        System.out.println(sum(5,6));
        System.out.println(MO.sum(56,67,69));
        System.out.println(MO.sum(67.893,256762.8999));
    }

}
