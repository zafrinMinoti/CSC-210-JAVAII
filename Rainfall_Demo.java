public class Rainfall_Demo
{
	public static void main(String[] args)
	{
		// Declare Variables
		// double[] rainfall2016;
		Rainfall nycRainfall2017 = new Rainfall();

		// call from Rainfall calss
		System.out.println("Monthly average: " +
				nycRainfall2017.monthlyAverage());
		System.out.println("Yearly total: " + 
				nycRainfall2017.yearTotal());
		System.out.println("Month with most rain: " +
				nycRainfall2017.monthWithMostRain());
		System.out.println("Month with least rain: " +
				nycRainfall2017.monthWithLeastRain());
	}
}