
public class tester {

    public static void main(String[] args) {

        eightToThree myEncoder = new eightToThree();
        myEncoder.setOctal();

        System.out.println("Octal : " + myEncoder.getOctal());
        System.out.println("Binary : " + myEncoder.encoder(myEncoder.getOctal()));

    }
}
