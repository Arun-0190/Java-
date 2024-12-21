class Queue {

    char[] Q;                       //the array will hold a character Queue
    int putLoc, getLoc;             //to put and get indices

    Queue(int size){

        Q = new char[size];             //allocating memory for queue
        putLoc = getLoc = 0;

    }

    //putting a character into queue
    void put(char ch){

        if(putLoc == Q.length){

            System.out.println(" - Queue is full");
            return;

        }

        Q[putLoc] = ch;
        putLoc++;
        //can be done like:     Q[putLoc++] = ch;

    }

    //getting a character from queue
    void get(){
        if(getLoc == putLoc){
            System.out.println(" - Queue is empty..");
            return;

        }

        System.out.println(Q[getLoc]);
        getLoc++;

    }

}

class QueueDemo{

    public static void main(String[] args) {

        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        System.out.println("Using BigQ to store alphabet.");
        //put some numbers in BigQ
        for( i = 0; i < 26; i++){
            bigQ.put((char) ('A'+i));
        }

        //displaying elements from it;
        System.out.println("Contents og BigQ: ");
        for(i = 0; i < 26; i++){
            bigQ.get();
        }
        System.out.println("\n");

        System.out.println("Using SmallQ to generate some errors.");
        for(i = 0; i < 5; i++){
            System.out.println("Attempting to store "+ (char)('Z' - i));
            smallQ.put((char)('Z' - i));
            System.out.println();
        }

        System.out.println();

        //more errors in smallQ
        System.out.println("Contents of smallQ: ");
        for(i =0; i < 5; i++){
            smallQ.get();
        }
    }

}


