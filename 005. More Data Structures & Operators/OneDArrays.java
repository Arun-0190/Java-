//Array data structure, some of the functions to do manipulations in it

public class OneDArrays {

    //printing the array elements of 1-D array
    public static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){

            System.out.println(i+"th element is: "+array[i]);

        }

    }

    //finding min max in the array
    public static void MinMax(int[] array){

        int min = array[0], max = array[0];

        for(int i = 0; i < array.length; i++){

            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];

        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);

    }

    public static void main(String[] args) {

        //ways to declare
        int[] DemoArray1 = new int[10];

        //filling using for loop
        for(int i = 9; i >= 0; i--){

            DemoArray1[i] = i*2;

        }
        int[] DemoArray2;
        DemoArray2 = new int[10];
        //filling elements one by one
        DemoArray2[0] = 100;
        DemoArray2[1] = 50;
        DemoArray2[2] = 25;
        DemoArray2[3] = 12;
        DemoArray2[4] = 6;
        DemoArray2[5] = 3;
        DemoArray2[6] = 2;
        DemoArray2[7] = 1;
        DemoArray2[8] = 0;
        DemoArray2[9] = -2;

        int[] DemoArray3 = {12,10, 3, 4, -56, 67, 89, 23, 45, 4, 3, 5};

        //using print method to print
        System.out.println("Array1: ");
        printArray(DemoArray1);
        MinMax(DemoArray1);
        System.out.println("\nArray2: ");
        printArray(DemoArray2);
        MinMax(DemoArray2);
        System.out.println("\nArray3: ");
        printArray(DemoArray3);
        MinMax(DemoArray3);

    }

}

