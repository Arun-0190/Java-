public class EncoderDecoder {

    //Using X-OR to encode and decode the message
    public static void main(String[] args) {

        String message = "This is a test message";
        String encodedmessage = "";
        String decodedmessage = "";

        int key = 90;               //a random key for the message encoding and decoding

        System.out.println("Original message: "+message);

        //encode
        for(int i = 0; i < message.length(); i++){

            encodedmessage = encodedmessage + (char)(message.charAt(i) ^ key);                  //decoding with using key x-or with th original message

        }

        System.out.println("Encoded Message: "+encodedmessage);

        //decode the message
        for(int i = 0; i < message.length(); i++){

            decodedmessage = decodedmessage + (char) (encodedmessage.charAt(i) ^ key);              //constructs a decoded message from encoded

        }

        System.out.println("Decoded Message: " + decodedmessage);

    }

}
