
public class tester {

    public static void main(String[] args) {

        // eightToThree class and function calls
        eightToThree myEncoder = new eightToThree();
        myEncoder.setOctal();

        System.out.println("Octal : " + myEncoder.getOctal());
        System.out.println("Binary : " + myEncoder.encoder(myEncoder.getOctal()));

        // threeToEight class and function calls
        threeToEight myDecode = new threeToEight();
        myDecode.setBinary();
        
        System.out.println("Binary : " + myDecode.getBinary());
        System.out.println("Octal : " + myDecode.decoder(myDecode.getBinary()));

    }
}
