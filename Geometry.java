import java.util.Scanner;

public class Geometry
{
	Scanner kb = new Scanner(System.in);
	int _shapeType;

	// public double getArea(int shapeType)
	// switch (shapeType)
	// {
	// 	case 1:
			
	// 		break;
	// }

	/**
	areaCircle method calculates the area of a circle
	@param radius The radius of a circle
	*/
	public static double areaCircle()
	{
		Scanner kb = new Scanner(System.in);
		double radius;
		System.out.print("Enter the radius of a circle: ");
		radius = kb.nextDouble();
		radius = validateNegative(radius);
		return Math.PI * radius * radius;
	}

	/**
	areaRectangle method calculates the area of a circle
	@param 
	*/
	public static double areaRectangle()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the length of a rectangle: ");
		double length = kb.nextDouble();
		length = validateNegative(length);

		System.out.print("Enter the width of a rectangle: ");
		double width = kb.nextDouble();
		width = validateNegative(width);

		return length * width;
	}

	/**
	areaTriangle method calculates the area of a circle
	@param 
	*/
	public static double areaTriangle()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the base of a triangle: ");
		double base = kb.nextDouble();
		base = validateNegative(base);

		System.out.print("Enter the height of a triangle: ");
		double height = kb.nextDouble();
		height = validateNegative(height);

		return base * height * 0.5;
	}	

	/**
	validateNegetive method validats to not except
	negetive numbers
	*/
	private static double validateNegative(double n)
	{
		Scanner kb = new Scanner(System.in);
		while (n<=0)
		{
			System.out.print(n + " is a negetive number\n" +
				"Enter a positive number: ");
			n = kb.nextDouble();
		}
		return n;
	}
}