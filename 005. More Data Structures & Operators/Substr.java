public class Substr {
    //using substring method for string manipulation

    public static void main(String[] args) {

        String original = "My name is Arun";

        //constructing a substring
        String substr = original.substring(11, 15);
        System.out.println("Original: "+ original);
        System.out.println("Substring: "+substr);

        //using text blocks
        String str = """
                Hii, my name is Arun
                And am coding in Java
                This is a text block.
                """;

        System.out.println(str);

    }

}
