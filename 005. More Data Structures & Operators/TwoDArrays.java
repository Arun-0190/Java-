//Array data structure, some of the functions to do manipulations on a 2-D array

public class TwoDArrays {

    //printing the array elements of 2-D array
    public static void printArray(int[][] array){

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.println("Element in " + i + "th row and " + j + "th column of the table is: " + array[i][j]);
            }
        }
    }

    //printing in a tabular form
    public static void printTable(int[][] array){

        System.out.println("Table is: ");

        //leaving a bit space at the beginning
        System.out.print("\t");

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.print("\n\t");
        }

    }

    public static void main(String[] args) {

        int[][] table1 = new int[3][3];
        int[][] table2;
        table2 = new int[3][3];
        table1 = table2;

        for(int  i =0; i < table1.length; i++){
            for(int j = 0; j < table1[i].length; j++){
                table1[i][j] = i+j;
            }
        }
        printArray(table1);
        System.out.println();
        printTable(table1);
        printTable(table2);

    }

}
