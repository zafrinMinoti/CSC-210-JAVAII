public class TestScores_Demo
{
	public static void main(String[] args)
	{
		double[] tscores = {80,90,70,100};
		
		try {
			TestScores scores = new TestScores(tscores);
			System.out.println(scores.getAverage());
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}