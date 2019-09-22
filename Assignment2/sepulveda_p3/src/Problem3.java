package sepulveda_p3;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int videogames, politics, movies, art, school;
		String[] topics = new String[] {
			"Video Games",
			"Politics",
			"Movies",
			"Art",
			"School"
		};
		System.out.println("Rate the importance of video games (1 - 10)");
		videogames = scnr.nextInt();
		System.out.println("Rate the importance of politics (1 - 10)");
		politics = scnr.nextInt();
		System.out.println("Rate the importance of movies (1 - 10)");
		movies = scnr.nextInt();
		System.out.println("Rate the importance of art (1 - 10)");
		art = scnr.nextInt();
		System.out.println("Rate the importance of school (1 - 10)");
		school = scnr.nextInt();
		

	}

}
