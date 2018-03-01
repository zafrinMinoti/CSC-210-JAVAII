/**
 * @author Zafrin Minoti (zafrin.minoti@gmail.com)
 * @date February 28, 2017
 * @title DriverExam Demo
 * Book - Starting Out with Java, 6e
 * Chapter 7 - Problem # 6
 * CSC 210 - Computer Programming 2
 * Prof. Persaud
 */

import java.util.Scanner;

public class DriverExam_Demo
{
	public static void main(String[] args)
	{
		// Declare Variables
		Scanner kb = new Scanner(System.in);
		DriverExam JDexam;

		// Get ans from student and create DriverExam object
		char[] JDans = studentAns();
		JDexam = new DriverExam(JDans);

		// Display exam results
		System.out.println("\nExam Result");
		System.out.println("=================================");
		// pass/fail
		showResult(JDexam);
		// total corract
		System.out.println("Score: " + JDexam.totalCorrect());
		// total incorrect
		System.out.println("Total Incorect: " + JDexam.totalIncorrect());
		// questions missed
		System.out.println("Questions missed: ");
		printArray(JDexam.questionsMissed());
	}

	/** 
		This method is used to get answers for all the questions 
		in the driver's exam, which consists of multipul choice questions
		It gets all the answers from one student per call (use).
		the user input is saved as characters in an array.
		@return ans An array that holds all the answears of a perticular student 
	*/
	public static char[] studentAns()
	{
		Scanner kb = new Scanner(System.in);
		char[] ans = new char[20];
		char letter;
		int error;

		for (int i=0; i<20; i++) {
			error = 0;
			do {
				if (error > 0)
					System.out.println("Oops... that's an invalid input\nTry again...");

				System.out.print(i+1 +". ");
				letter = kb.nextLine().charAt(0);
				letter = Character.toUpperCase(letter);
				error +=1;
			} while (letter != 'A' && letter != 'B' && letter != 'C' && letter != 'D');

			ans[i] = letter;
		}
	return ans;
	}

	/** 
		This method is used to display the Driver's exam result 
		of a perticular student.
		The class method passed() only returns a Boolean value.
		@param obj obj is an instance of a DriverExam class
	*/
	public static void showResult(DriverExam obj)
	{
		if (obj.passed())
			System.out.println("PASSED");
		else
			System.out.println("FAILED");
	}

	/**
		This method is ued to print out all the elements
		of an int array.
		@param array The array that holds the answears of a student
	*/
	public static void printArray(int[] array)
	{
		for (int i=0; i<array.length; i++)
			System.out.print(array[i] + ", ");
	}
}