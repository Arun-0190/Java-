public class StringsOperations {

    public static void main(String[] args) {

        String a = "Hehe, I'm programming in Java";
        String b = "Java is a very powerful language";

        //using the .length
        for(int i = 0; i < a.length(); i++){

            //using char at
            System.out.print(a.charAt(i)+" ");          //prints one character at a time from string
        }

        System.out.println();

        //using equals
        if(a.equals(b)){
            System.out.println("a and b strings are equal");
        }else{
            System.out.println("a and b strings are not equal");
        }

        //using compareTo
        int result = a.compareTo(b);
        if(result == 0){
            System.out.println("a and b strings are equal");
        }else if(result < 0){
            System.out.println("a is lesser than b");
        }else{
            System.out.println("a is greater than b");
        }

        //using index of
        int index = a.indexOf("Java");
        System.out.println("Index of first occurrence of Java is: "+index);

        index = a.indexOf("Arun");
        System.out.println("Index of first occurrence of Arun is: "+index);

        //using last index
        String c = "one two three one";
        index = c.lastIndexOf("one");
        System.out.println("Index of last occurrence of one is: "+index);

    }

}
