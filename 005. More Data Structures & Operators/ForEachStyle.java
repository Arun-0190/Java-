public class ForEachStyle {

    //for each style loop in java
    public static void main(String[] args) {

        int[] nums = {23,45,67,69,34,89,34};

        //showing
        System.out.print("Nums: ");
        for(int i: nums){
            System.out.print(i+"  ");
        }

        //for multidimensional arrays
        int[][] nums2 = new int[5][7];

        //for giving values we have to use normal for loops
        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums2[i].length; j++){
                nums2[i][j] = i + 8*i+4*(4+j);           //random value
            }
        }
        System.out.println();

        //for showing
        System.out.println("The array is: ");
        for( int[] i : nums2){

            for(int j : i){

                System.out.print(j+"  ");

            }
            System.out.println();
        }

    }
}
