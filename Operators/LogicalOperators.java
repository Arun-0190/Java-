public class LogicalOperators {

    //Printing truth tables for various logical operators using them
    //& - And, | - Or, ! - not, ^ - xor

    public static void main(String[] args) {

        boolean p, q;

        //printing the first line
        System.out.println("P   \tQ   \tAND   \tNAND   \tOR   \tNOR   \tXOR   \tXNOR   \tNOT   ");          //gives the heading line for truth table
        //leaving space to get a correct indentation

        //initial with both true
        p = true;   q = true;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(!(p&q))+"\t"+(p|q)+"\t"+(!(p|q))+"\t"+(p^q)+"\t"+(!(p^q))+"\t"+(!p)+"\n");

        //second one
        p = true;   q = false;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(!(p&q))+"\t"+(p|q)+"\t"+(!(p|q))+"\t"+(p^q)+"\t"+(!(p^q))+"\t"+(!p)+"\n");

        //third combination
        p = false;   q = true;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(!(p&q))+"\t"+(p|q)+"\t"+(!(p|q))+"\t"+(p^q)+"\t"+(!(p^q))+"\t"+(!p)+"\n");

        //fourth combination
        p = false;   q = false;
        System.out.print(p+"\t"+q+"\t");
        System.out.print((p&q)+"\t"+(!(p&q))+"\t"+(p|q)+"\t"+(!(p|q))+"\t"+(p^q)+"\t"+(!(p^q))+"\t"+(!p)+"\n");

    }
}
