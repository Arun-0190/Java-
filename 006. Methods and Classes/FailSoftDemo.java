//public vs private access
class FailSoftArray{

    private int[] a;            //reference to an array
    private final int errval;         //value to return if get() fails
    public int length;
    /*
    Constructing an array given it's size and the value to return ig get() fails
    */
    public FailSoftArray(int size, int errv){
        a = new int[size];
        errval = errv;
        length = size;
    }

    //Return value at an index
    public int get(int index){
        if(indexOK(index)) return a[index];
        return errval;
    }

    //Put a value to an index, return false on failure
    public boolean put(int index, int val){
        if(indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    //Return true if index is within bounds
    private boolean indexOK(int index){
        if (index >= 0 & index < length) return true;
        return false;
    }

}

//Demonstration
public class FailSoftDemo {

    public static void main(String[] args) {

        FailSoftArray fsa = new FailSoftArray(5,-1);
        int x;

        //show quiet failures
        System.out.println("Fail Quietly");
        for(int i = 0; i < fsa.length*2; i++){
            fsa.put(i, i*6);
        }

        for(int i = 0; i < fsa.length*2; i++){
            x = fsa.get(i);
            if(x != -1) System.out.println(x+"  ");
        }
        System.out.println();
        //now handling failures
        System.out.println("\n Fail with error reports.");
        for(int i = 0; i < fsa.length*2; i++){
            if(!fsa.put(i, i*6))
                System.out.println("Index"+i+" out-of-bounds");

        }

        for(int i = 0; i < fsa.length*2; i++){
            x = fsa.get(i);
            if(x != -1) System.out.println(x+"  ");
            else
                System.out.println("Index "+i+" out-of-bounds");

        }

    }

}
