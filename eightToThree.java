import java.util.Random;

public class eightToThree {

    private char octal;

    public eightToThree(char octal) {
        this.octal = octal;

    }

    public eightToThree() {
        octal = '0';

    }

    public void setOctal() {

        Random random = new Random();

        char number = (char) (random.nextInt(0, 8) + '0');

        octal = number;
    }

    public char getOctal() {

        return octal;
    }

    public String encoder(char testing) {

        String binary = "";

        if (testing == '0') {
            binary = "000";
            return binary;
        }
        if (testing == '1' || testing == '2' || testing == '3') {
             binary += '0';
        } else {
            binary += '1';
        }
        if (testing == '1' || testing == '4' || testing == '5') {
            binary += '0';
        } else {
            binary += '1';
        }
        if (testing == '1' || testing == '3' || testing == '5' || testing == '7') {
            binary += '1';
        } else {
            binary += '0';
        }

        return binary;
    }

}