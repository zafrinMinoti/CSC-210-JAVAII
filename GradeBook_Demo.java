import java.util.Scanner;

public class GradeBook_Demo
{
	public static void main(String[] args)
	{
		int NUM_STUDENTS = 5;
		int NUM_TESTS = 4;
		Scanner kb = new Scanner(System.in);
		GradeBook gb = new GradeBook();

		// Get names for each student from the user
		String name;
		for (int i = 1; i <= NUM_STUDENTS; i++) {
			System.out.print("Enter name of student " + i + ": ");
			name = kb.nextLine();
			gb.setName(i,name);
			System.out.println(gb.getName(i));
		}

		// Get test scores of each students
		double score;
		double[] student_scores;
		for (int student = 1; student <= NUM_STUDENTS; student++) {
			student_scores = new double[NUM_TESTS];
			System.out.println("Enter test scores for " + gb.getName(student));
			for (int test = 0; test < NUM_TESTS; test++) {
				System.out.print("Test " + test+1 + ": ");
				score = kb.nextDouble();
				student_scores[test] = score;
			gb.setScores(student, student_scores);
			}
		}

		// Desplay student names and their grades
		System.out.println("\nHere's the summery of all students and their scores: ");
		for (int i=1; i <= NUM_STUDENTS; i++) {
			System.out.println(gb.getName(i) + 
								"\tScore: " + gb.getAverage(i) +
								"\tGrade: " + gb.getLetterGrade(i));
		}
	}
}