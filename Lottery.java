/**
 * @author Zafrin Minoti (zafrin.minoti@gmail.com)
 * @date February 28, 2017
 * @title Lottery Classfile
 * Book - Starting Out with Java, 6e
 * Chapter 7 - Problem # 10
 * CSC 210 - Computer Programming 2
 * Prof. Persaud
 */

// Import statements
import java.util.Random;

public class Lottery
{
	// Private fields
	private final int SIZE = 5;
	private Random r = new Random();
	private int[] lotteryNumbers = new int[SIZE];
	private int[] playerNumbers = new int[SIZE];

	// Constructor
	public Lottery(int[] playerNum)
	{
		lotteryNumbers = setLotteryNumbers();
		playerNumbers = playerNum;
	}

	/**
		Randomly set lotery numbers
		@lotteryNumbers Array holding lotery winning numbers
	*/
	private int[] setLotteryNumbers()
	{
		for (int i=0; i<SIZE; i++) {
			lotteryNumbers[i] = r.nextInt(10);
		}
		return lotteryNumbers;
	}

	/**
		Calculates how many digits match between 
		lotteryNumberscand used picked numbers.
		Prints winning statements with user-friendly manner. 
	*/
	public void getResult()
	{
		int matchCount = 0;
		for (int i=0; i<SIZE; i++) {
			if (playerNumbers[i] == lotteryNumbers[i]) {
				matchCount +=1;
			}			
		}
		if (matchCount == 5) {
			System.out.println("Congratulations!!!" +
				"\nYou won the grand prize!!!");
		}
		else if (matchCount == 0)
			System.out.println("Sorry, there were no match");
		else
			System.out.println(matchCount + " of your numbers matched.");
	}

}