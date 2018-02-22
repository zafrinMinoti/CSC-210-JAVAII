public class Rainfall
{
	// private fields
	private double[] monthlyRainFall;

	private String[] months = { "January", "February", "March", 
			"April", "May", "June", "July", "August", 
			"September", "October", "November", "December"};
	
	// overloading Constructors
	public Rainfall(double r[])
	{
		monthlyRainFall = r;
	}

	public Rainfall()
	{
		// NYC monthlyrainfall in 2017
		double[] nycMonthlyRainFall = { 6.32, 3.98, 6.13, 8.34, 8.87,
		7.23, 7.14, 4.78, 3.16, 5.56, 4.72, 2.40 };
		monthlyRainFall = nycMonthlyRainFall;
	}

	// Accessor methods
	public double yearTotal()
	{
		double total = 0; 
		for (int i=0; i<monthlyRainFall.length; i++)
			total += monthlyRainFall[i];
		return total;
	}

	public double monthlyAverage()
	{
		return yearTotal()/monthlyRainFall.length;
	}

	public String monthWithMostRain()
	{
		int index = 0;
		double mostRain = monthlyRainFall[index];

		// get the index number of highest monthlyrainfall
		for (int i=index+1; i<monthlyRainFall.length; i++)
		{
			if (monthlyRainFall[i] > mostRain)
			{
				mostRain = monthlyRainFall[i];
				index = i;
			}
		}

		// get the month in that index
		return months[index];
	}

	public String monthWithLeastRain()
	{
		int index = 0;
		double leastRain = monthlyRainFall[index];

		// get the index number of least amount of monthlyrainfall
		for (int i=index+1; i<monthlyRainFall.length; i++)
		{
			if (monthlyRainFall[i] < leastRain)
			{
				leastRain = monthlyRainFall[i];
				index = i;
			}
		}

		// get the month in that index
		return months[index];
	}
}