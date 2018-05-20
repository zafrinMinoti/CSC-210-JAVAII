public class Area
{
	// Fields
	
	// Constructors

	// overload methods
	public double getArea(double r)
	{
		return Math.PI*r*r;
	}

	public double getArea(int l, int w)
	{
		return l*w;
	}

	public double getArea(double r, double h)
	{
		return Math.PI*r*r*h;
	}

}