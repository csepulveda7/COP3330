package sepulveda_p3;
public class Problem3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int row , col, sum;
		int maxRow = -1;
		int minRow = -1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		String[] topics = new String[] {"Video Games","Politics","Movies","Art","School"};
		int[][] responses = new int[5][10];

		for (row = 0; row < 5; row++)
		{
			for (col = 0; col < 10; col++)
			{
				System.out.printf("User %d: Rate the importance of %s in your life (1 - 10)\n", col + 1, topics[row]);
				responses[row][col] = scnr.nextInt();
				if (responses[row][col] < 1 || responses[row][col] > 10)
				{
					System.out.println("Error: User Input Invalid");
					return;
				}
			}
		}

		for (row = 0; row < 5; row++)
		{
			sum = 0;
			System.out.printf("\n%-50s", topics[row]);
			for (col = 0; col < 10; col++)
			{
				sum += responses[row][col];
				System.out.printf("%2d", responses[row][col]);
			}

			if (sum >= max)
			{
				max = sum;
				maxRow = row;
			}

			else if (sum <= min)
			{
				min = sum;
				minRow = row;
			}

			System.out.printf(" AVG: %.2f\n", (double) (sum / 10));
		}

		System.out.printf("\nThe topic with the most points was \"%s\" with %d points.\n", topics[maxRow], max);
		System.out.printf("The topic with the least points was \"%s\" with %d points.\n", topics[minRow], min);
	}
}
