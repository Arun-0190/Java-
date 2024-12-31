public class CommandLineArguments {

    //An automated Telephone directory using command line arguments

    public static void main(String[] args) {

        String[][] numbers = {
                {"Arun", "922-891889"},
                {"Rohan", "997-892678"},
                {"Radha", "881-456729"},
                {"Bars", "562-551166"}
            };

        int i;
        if(args.length != 1){           //to use the program, one command line argument must be present
            System.out.println("Usage: java Phone <name>");
        }else{
            for(i = 0; i < numbers.length; i++){
                if(numbers[i][0].equals(args[0])){
                    System.out.println(numbers[i][0]+": "+numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length){
                System.out.println("Name not found");
            }
        }

    }
}
