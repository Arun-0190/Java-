public class SwitchNoBreak {

    //switch case with no break

    public static void main(String[] args) {

        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {

                //case 1
                case 0:
                    System.out.println(i + " is less than one.");

                //case 2
                case 1:
                    System.out.println(i+ " is less than two.");

                //case 3
                case 2:
                    System.out.println(i+" is less than three.");

                //case 4
                case 3:
                    System.out.println(i+" is less than four.");

                case 4:
                    System.out.println(i+" is less than five.");
            }
            System.out.println();
        }
    }

}
