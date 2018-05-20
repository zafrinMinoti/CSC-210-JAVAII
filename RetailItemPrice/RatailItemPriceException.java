public class RatailItemPriceException extends Exception
{
	public RatailItemPriceException()
	{
		super("Error: Price is out of range.\n" +
			"Price must be greater than 0.")
	}

	public RatailItemPriceException(double price)
	{
		super("Error: " + price + " is not a valid price\n" +
			"Price must be greater than 0.")
	}
}