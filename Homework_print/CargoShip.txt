public class CargoShip extends Ship
{
	// Fields
	private int cargoCapacity;

	// Constructor
	public CargoShip(String name, int year, int cargoCapacity)
	{
		super(name, year);
		this.cargoCapacity = cargoCapacity;
	}

	// Mutator(s)
	public void setCargoCapacity(int cargoCapacity)
	{
		this.cargoCapacity = cargoCapacity;
	}

	// Accessor(s)
	public int getCargoCapacity()
	{
		return cargoCapacity;
	}

	// overriding toString method
	public String toString()
	{
		return "The cargo ship named " + this.getName() +
				" has a capacity of " + cargoCapacity;
	}
}