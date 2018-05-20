public class IllegalArgumentException extends Exception
{
	public IllegalArgumentException()
	{
		super("Error: The test Score is out of range.\n" +
			"Score must be a non-negetive number less than or equal to 100");
	}

	public IllegalArgumentException(double score)
	{
		super("Error: " + score + " is not a valid score\n" +
			"Score must be a non-negetive number less than or equal to 100");
	}
}