
public class tester {

    public static void main(String[] args) {

        threeToEight myDecode = new threeToEight();

        myDecode.setBinary();
        System.out.println("Binary : " + myDecode.getBinary());
        System.out.println("Octal : " + myDecode.decoder(myDecode.getBinary()));
    }
}
