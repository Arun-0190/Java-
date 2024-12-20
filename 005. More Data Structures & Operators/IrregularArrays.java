public class IrregularArrays {

    //We can define the multidimensional arrays differently too
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

        int[][] table = new int [5][];
        table[0] = new int[5];
        table[1] = new int[4];
        table[2] = new int[3];
        table[3] = new int[2];
        table[4] = new int[1];

        //in this array, the number of columns in every row is different
        // is irregular type of array
        //we can print it similar to that of 2-D just a little bit of updated traversal method

        for(int i = 0; i < table.length; i++){

            for(int j = 0; j < table[i].length; j++){

                table[i][j] = i * j + i*2 + j + 1;          //providing the value to it

            }
        }

        printArray(table);
        printTable(table);

    }

}
