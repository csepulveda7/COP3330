import java.util.Scanner;
import java.security.SecureRandom;
public class Problem1 {

    public static int questionType(int type, int num1, int num2){
        Scanner scnr = new Scanner(System.in);
        double ans;

        switch (type) {
            case 1:
                System.out.printf("How much is %d plus %d?\n", num1, num2);
                ans = scnr.nextDouble();

                if (Math.abs(ans - (num1 + num2)) > 0.0001) {
                    incorrectResponse();
                    return 0;
                }
                else {
                    correctResponse();
                    return 1;
                }

            case 2:
                System.out.printf("How much is %d times %d?\n", num1, num2);
                ans = scnr.nextDouble();

                if (Math.abs(ans - (num1 * num2)) > 0.0001) {
                    incorrectResponse();
                    return 0;
                }
                else {
                    correctResponse();
                    return 1;
                }

            case 3:
                System.out.printf("How much is %d minus %d?\n", num1, num2);
                ans = scnr.nextDouble();

                if (Math.abs(ans - (num1 - num2)) > 0.0001) {
                    incorrectResponse();
                    return 0;
                }
                else {
                    correctResponse();
                    return 1;
                }

            case 4:
                System.out.printf("How much is %d divided by %d? (Round to the thousandth)\n", num1, num2);
                ans = scnr.nextDouble();

                if (Math.abs(ans - ((double)num1 / (double)num2)) > 0.001) {
                    incorrectResponse();
                    return 0;
                }
                else {
                    correctResponse();
                    return 1;
                }
        }

        return 1;

    }
    public static int difficultyLevel(int type, int level){
        switch (level) {
            case 1:
                return askQuestion(type,1,9);
            case 2:
                return askQuestion(type,10,99);
            case 3:
                return askQuestion(type,100,999);
            case 4:
                return askQuestion(type,1000,9999);
        }

        return 0;
    }

    public static void incorrectResponse() {
        SecureRandom random = new SecureRandom();

        switch (random.nextInt(4) + 1) {
            case 1:
                System.out.println("Wrong answer.\n");
                break;
            case 2:
                System.out.println("Wrong. Try another one.\n");
                break;
            case 3:
                System.out.println("Don’t give up!\n");
                break;
            case 4:
                System.out.println("Incorrect\n");
                break;
        }
    }

    public static void correctResponse() {
        SecureRandom random = new SecureRandom();

        switch (random.nextInt(4) + 1) {
            case 1:
                System.out.println("Very good!\n");
                break;
            case 2:
                System.out.println("Excellent!\n");
                break;
            case 3:
                System.out.println("Nice work!\n");
                break;
            case 4:
                System.out.println("Keep up the good work!\n");
                break;
        }
    }

    public static int askQuestion(int type, int min, int max){
        SecureRandom random = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        int num1 = random.nextInt((max - min) + 1) + min;
        int num2 = random.nextInt((max - min) + 1) + min;

        if (type == 5)
            type = random.nextInt(5) + 1;

        return questionType(type, num1, num2);
    }

    public static void main (String[] args) {
        int flag = 1;
        int numCorrect, numIncorrect, percentCorrect, type, level;

        Scanner scnr = new Scanner(System.in);

        while(flag != -1) {
            numCorrect = 0;
            numIncorrect = 0;

            System.out.println("Please enter an option: (1 = Addition) (2 = Multiplication) (3 = Subtraction) (4 = Division) (5 = Random)");
            type = scnr.nextInt();

            System.out.println("Please enter a difficulty level:");
            level = scnr.nextInt();

            for(int i = 0; i < 10; i++){
                if (difficultyLevel(type,level) == 1)
                    numCorrect += 1;
                else
                    numIncorrect += 1;
            }

            percentCorrect = numCorrect * 10;

            System.out.printf("Correct Answers: %d\nIncorrect Answers: %d\n\n", numCorrect, numIncorrect);

            if (percentCorrect < 75)
                System.out.println("Please ask your teacher for extra help.");
            else
                System.out.println("Congratulations, you are ready to go to the next level!");

            System.out.println("\nEnter any number to start a new session (Quit: -1):");
            flag = scnr.nextInt();
        }
    }
}
