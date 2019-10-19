import java.util.Scanner;
import java.security.SecureRandom;
public class Problem1 {

    public static void askQuestion(){
        SecureRandom random = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int num1 = Math.abs(random.nextInt() + 1) % 10;
        int num2 = Math.abs(random.nextInt() + 1) % 10;
        double ans = 100;

        while (Math.abs(ans - (num1 * num2)) > 0.0001) {
            System.out.printf("How much is %d times %d?\n", num1, num2);
            ans = scnr.nextInt();

            if (Math.abs(ans - (num1 * num2)) > 0.0001)
                System.out.println("No. Please try again.");
        }

        System.out.println("Very good!");
    }

    public static void main (String[] args) {
        askQuestion();
        for (int i = 0; i < 10; i++) {
            askQuestion();
        }
    }
}
