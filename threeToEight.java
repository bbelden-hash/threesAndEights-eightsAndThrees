import java.util.Random;

public class threeToEight {

    private String binary;

    public threeToEight(String binary) {
        this.binary = binary;

    }

    public threeToEight() {
        binary = "";

    }

    public void setBinary() {

        Random random = new Random();

        String tempBinary = "";

        for (int i = 0; i < 3; i++) {
            tempBinary += random.nextInt(0, 2);
        }

        binary = tempBinary;
    }

    public String getBinary() {

        return binary;
    }

    public int decoder(String convert) {

        String temp = "";

        char fours = convert.charAt(0);
        char twos = convert.charAt(1);
        char ones = convert.charAt(2);

        if (fours == '1') {
            temp = "4567";
        } else {
            temp = "0123";
        }

        if (twos == '1') {
            temp += "2367";
        } else {
            temp += "0145";
        }

        if (ones == '1') {
            temp += "1357";
        } else {
            temp += "0246";
        }

        int iteration = 0;
        int zeros = 0;
        int uno = 0;
        int dos = 0;
        int threes = 0;
        int quatros = 0;
        int fives = 0;
        int sixes = 0;
        int sevens = 0;

        while (iteration < temp.length()) {

            if (temp.charAt(iteration) == '0') {
                zeros += 1;
                iteration += 1;
            }
            else if (temp.charAt(iteration) == '1') {
                uno += 1;
                iteration += 1;
            }
            else if (temp.charAt(iteration) == '2') {
                dos += 1;
                iteration += 1;
            }
            else if (temp.charAt(iteration) == '3') {
                threes += 1;
                iteration += 1;
            }
            else if (temp.charAt(iteration) == '4') {
                quatros += 1;
                iteration += 1;
            }
            else if (temp.charAt(iteration) == '5') {
                fives += 1;
                iteration += 1;
            }
            else if (temp.charAt(iteration) == '6') {
                sixes += 1;
                iteration += 1;
            }
            else if (temp.charAt(iteration) == '7') {
                sevens += 1;
                iteration += 1;
            }
        }

        int[] instances = {zeros, uno, dos, threes, quatros, fives, sixes, sevens};

        int max = 3;
        int octal = 0;

        for (int n = 0; n < instances.length; n++) {
            if (instances[n] == max) {
                octal = n;
                break;
            }
        }

        return octal;
    }
}