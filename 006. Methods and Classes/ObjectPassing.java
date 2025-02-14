//objects can be passed to methods
class Block {

    int a, b, c;
    int volume;

    Block(int i, int j, int k) {

        a = i;
        b = j;
        c = k;
        volume = a * b * c;

    }

    //Return true if object defines same block
    boolean sameBlock(Block ob) {

        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    //Return if block has same volume
    boolean sameVolume(Block ob){
        if(ob.volume == volume) return true;
        else return false;
    }
}

public class ObjectPassing {

    public static void main(String[] args) {
        Block ob1 = new Block(10,20,3);
        Block ob2 = new Block(10,20,3);
        Block ob3 = new Block(10,3,20);

        System.out.println("Object1 has same dimensions as object2: "+ob1.sameBlock(ob2));
        System.out.println("Object2 has same dimensions as object3: "+ob2.sameBlock(ob3));
        System.out.println("Object1 has same volume as object3: "+ob1.sameVolume(ob3));
    }

}
