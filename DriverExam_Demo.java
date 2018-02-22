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

		// Display result
		System.out.println("\nExam Result");
		System.out.println("=================================");
		if (JDexam.passed())
			System.out.println("PASSED");
		else
			System.out.println("FAILED");

		System.out.println("Score: " + JDexam.totalCorrect());
		System.out.println("Total Incorect: " + JDexam.totalIncorrect());
		System.out.println("Questions missed: ");
		int[] missedQuestions = JDexam.questionsMissed();
		for (int i=0; i<missedQuestions.length; i++) {
			System.out.print(missedQuestions[i] + ", ");
		}
	}

	public static char[] studentAns()
	/** method to get ans for each question in the exam
	*/
	{
		Scanner kb = new Scanner(System.in);
		char[] ans = new char[20];
		// add validation
		for (int i=0; i<20; i++) {
			System.out.print(i+1 +". ");
			ans[i] = kb.nextLine().charAt(0);
			ans[i] = Character.toUpperCase(ans[i]);
		}
	return ans;
	}
}