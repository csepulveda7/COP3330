package sepulveda_p2;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double BMI = 0;
		int choice, userWeight, userHeight;
		
		System.out.println("Enter 1 for Metric System, Enter 2 for Customary System?:");
		choice = scnr.nextInt();

		if (choice == 1)
		{
			System.out.println("Enter your weight in kilograms:");
			userWeight = scnr.nextInt();
			System.out.println("Enter your height in meters:");
			userHeight = scnr.nextInt();

			BMI = (double)userWeight / (userHeight * userHeight);
		}
		else if (choice == 2)
		{
			System.out.println("Enter your weight in pounds:");
			userWeight = scnr.nextInt();
			System.out.println("Enter your height in inches:");
			userHeight = scnr.nextInt();

			BMI = (double)(703 *userWeight) / (userHeight * userHeight);
		}

		System.out.printf("Your BMI: %.1f\n",BMI);
		System.out.println("\nUnderweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9 ");
		System.out.println("Obesity = BMI of 30 or greater");
		
		

	}

}
