package sepulveda_p1;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a 4-digit number to encrypt:");
		int data = scnr.nextInt();

		int digit1 = (((data / 1000) % 10) + 7) % 10;
		int digit2 = (((data / 100) % 10) + 7) % 10;
		int digit3 = (((data / 10) % 10) + 7) % 10;
		int digit4 = (((data / 1) % 10) + 7) % 10;

		int encrypted = (digit3 * 1000) + (digit4 * 100) + (digit1 * 10) + digit2;

		System.out.println(encrypted);

		System.out.println("Enter a 4-digit number to decrypt:");
		
		int data2 = scnr.nextInt();

		digit3 = (((data / 1000) % 10) - 7) % 10;
		digit4 = (((data / 100) % 10) - 7) % 10;
		digit1 = (((data / 10) % 10) - 7) % 10;
		digit2 = (((data / 1) % 10) - 7) % 10;

		int decrypted = (digit1 * 1000) + (digit2 * 100) + (digit3 * 10) + digit4;
		
		System.out.println(decrypted);

	}

}
