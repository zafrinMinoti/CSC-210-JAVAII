public class ShipDemo
{
	public static void main(String[] args)
	{
		Ship[] ships = {new Ship("See Queen", 1974),
						new CruiseShip("SunSee", 2001, 5000), 
						new CargoShip("See Gient", 1999, 8500)};
		for(int ship=0; ship<ships.length; ship++)
		{
			System.out.println(ships[ship]);
		}
	}
}