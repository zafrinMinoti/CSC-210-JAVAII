public class TestScores
{
	// fields
	private double[] scores;

	// Constructor(s)
	TestScores(double[] scores) throws IllegalArgumentException
	{
		for(int i=0; i<scores.length; i++)
		{
			if(scores[i]<0 || scores[i]>100)
				throw new IllegalArgumentException(scores[i]);
		}
		this.scores = scores;
	}

	public double getAverage()
	{
		double sumScores = scores[0];
		for(int i=1; i<scores.length; i++) {
			sumScores += scores[i];
		}
		return sumScores/scores.length;
	}
}