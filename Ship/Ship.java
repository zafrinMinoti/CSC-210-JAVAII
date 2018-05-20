public class Ship
{
	// fields
	private String name;
	private int year;

	// Constructor
	public Ship(String name, int year)
	{
		this.name = name;
		this.year = year;
	}

	// Mutators
	public void setName(String name)
	{
		this.name = name;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	// Accessors
	public String getName()
	{
		return name;
	}

	public int getYear()
	{
		return year; 
	}

	// overriding toString Method
	public String toString()
	{
		return "A ship with name " + this.name +
				" was built in " + this.year;
	}
}