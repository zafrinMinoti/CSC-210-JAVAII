public class CruiseShip extends Ship
{
	// Fields
	private int maxPassengers;

	// Constructor
	public CruiseShip(String name, int year, int maxPassengers)
	{
		super(name, year);
		this.maxPassengers = maxPassengers;
	}

	// Mutator(s)
	public void setMaxPassengers(int maxPassengers)
	{
		this.maxPassengers = maxPassengers;
	}

	// Accessor(s)
	public int getMaxPassengers()
	{
		return maxPassengers;
	}

	// overriding toString method
	public String toString()
	{
		return "The cruise ship named " + this.getName() +
				" can take up to " + maxPassengers + " passengers";
	}
}