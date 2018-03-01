/**
 * @author Zafrin Minoti (zafrin.minoti@gmail.com)
 * @date February 28, 2017
 * @title DriverExam Demo
 * Book - Starting Out with Java, 6e
 * Chapter 7 - Problem # 10
 * CSC 210 - Computer Programming 2
 * Prof. Persaud
 */

// Import statements
import java.util.Scanner;

public class Lottery_Demo
{
	/**
		Main method
	*/
	public static void main(String[] args)
	{
		Lottery JDnumbers;
		int[] picks;

		// ask player to pick numbers
		picks = playerNumbers();

		// Create object
		JDnumbers = new Lottery(picks);

		// Show result
		JDnumbers.getResult();
	}

	/**
		Askes players to enter numbers
		@return numbers An array of 5 numbers with player's input
	*/
	public static int[] playerNumbers()
	{
		Scanner kb = new Scanner(System.in);
		int num, error;
		final int s = 5;
		int[] numbers = new int[s];

		System.out.println("You have to pick 5 numbers for the lottery" +
			"\nEach number has to be between 0 and 9.");

		for (int i=1; i<=s; i++) {
			error = 0; num = -1;
			do {
				if (error > 0)
					System.out.println("Oops... that's an invalid input\nTry again...");

				System.out.print("Digit #" + i + ": ");
				num = kb.nextInt();
				error +=1;
			} while (num < 0 || num >= 10);

			numbers[i-1] = num;
		}
		return numbers;
	}

}
