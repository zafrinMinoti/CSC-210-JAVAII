public class RetailItemPriceException extends Exception
{
	public RetailItemPriceException()
	{
		super("Error: Price is out of range.\n" +
			"Price must be greater than 0.");
	}

	public RetailItemPriceException(double price)
	{
		super("Error: " + price + " is not a valid price\n" +
			"Price must be greater than 0.");
	}
}