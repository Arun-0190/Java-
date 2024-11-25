public class weightonmoon {

    //weight on earth and moon
    public static void main(String[] args) {

        double weightearth1 = 78;
        double weightearth2 = 69;
        double weightearth3 = 100;

        double weightmoon1, weightmoon2, weightmoon3;

        weightmoon1 = ((double)17/100) * weightearth1;
        weightmoon2 = ((double)17/100) * weightearth2;
        weightmoon3 = ((double)17/100) * weightearth3;

        System.out.print("Weight1 on Earth: "+weightearth1+"\t\t");
        System.out.println("Weight1 on Moon: "+weightmoon1);

        System.out.print("Weight2 on Earth: "+weightearth2+"\t\t");
        System.out.println("Weight2 on Moon: "+weightmoon2);

        System.out.print("Weight3 on Earth: "+weightearth3+"\t\t");
        System.out.println("Weight3 on Moon: "+weightmoon3);
    }

}
