public class GradeBook
{
	// Private fields
	private int NUM_STUDENTS = 5;
	private int NUM_TESTS = 4;
	private String[] names = new String[NUM_STUDENTS];
	private char[] grades = new char[NUM_STUDENTS];
	private double[] s0scores = new double[NUM_STUDENTS]; 
	private double[] s1scores = new double[NUM_STUDENTS];
	private double[] s2scores = new double[NUM_STUDENTS];
	private double[] s3scores = new double[NUM_STUDENTS];
	private double[] s4scores = new double[NUM_STUDENTS];
	// private double[][] scores = {s0scores, s1scores, s2scores, s3scores, s4scores};
	// private double[][] scores = new double[NUM_STUDENTS][NUM_TESTS];
	private double[] averages = new double[NUM_STUDENTS]; // may not need it

	// Constructors
	// public GradeBook(int NUM_STUDENTS, int NUM_TESTS)
	// {
		// names = new String[NUM_STUDENTS];
	// private double[][] scores = new double[NUM_STUDENTS][NUM_TESTS];
	// }

	// Methods involving names
	public void setName(int student_id, String name)
	{
		names[student_id-1] = name;
	}

	public String getName(int student_id)
	{
		return names[student_id-1];
	}

	// Methods involving Scores
	public void setScores(int student_id, double[] student_scores)
	{
		switch (student_id-1)
		{
			case 0:
				s0scores = student_scores;
				calculateAverage(0,s0scores);
				assignGrade(0,s0scores);
				break;
			case 1:
				s1scores = student_scores;
				calculateAverage(1,s1scores);
				assignGrade(1,s0scores);
				break;
			case 2:
				s2scores = student_scores;
				calculateAverage(2,s2scores);
				assignGrade(2,s0scores);
				break;
			case 3:
				s3scores = student_scores;
				calculateAverage(3,s3scores);
				assignGrade(3,s0scores);
				break;
			case 4:
				s4scores = student_scores;
				calculateAverage(4,s4scores);
				assignGrade(4,s0scores);
				break;
			default:
				break;
		}

		// scores[student_id] = student_scores;
	}

	private void calculateAverage(int student_id, double[] student_scores)
	{
		double total =0;
		for (int test = 0; test < NUM_TESTS; test++) {
			total += student_scores[test];
		}
		double avg = total/NUM_TESTS;
		averages[student_id] = avg;
	}

	public double getAverage(int student_id)
	{
		return averages[student_id-1];
	}

	// Methods involving letter grades
	private void assignGrade(int student_id, double[] students_scores)
	{
		// determine letter grades for each of the students
		double student_avg  = averages[student_id];
		char grade;

		if (student_avg >= 90)
			grade = 'A';
		else if (student_avg < 90 && student_avg >= 80)
			grade = 'B';
		else if (student_avg < 80 && student_avg >= 70)
			grade = 'C';
		else if (student_avg < 70 && student_avg >= 60)
			grade = 'D';
		else
			grade = 'F';
		// Add students' letter grade to to grades array
		grades[student_id] = grade;
	}

	public char getLetterGrade(int student_id)
	{
		return grades[student_id-1];
	}
}