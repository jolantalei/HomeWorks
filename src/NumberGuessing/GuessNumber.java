package NumberGuessing;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int userNumber = myScanner.nextInt();

        double myNumber = Math.random();
        double myNumberInRange = myNumber * 100;
        int roundedNumber = (int) myNumberInRange;// int roundedNumber = (MAth.random() *100) šadi var vienā līnijā

        if (userNumber > roundedNumber) {

        } else if (userNumber == roundedNumber) {
            System.out.println("You guested");
        } else {
            System.out.println("Your guess is to low");
        }
    }
}
