import java.util.Scanner;

public class Geometry_Demo
{
	public static void main(String[] args)
	{
		int choice = ShapeChoice();
		double area=-1;

		switch (choice)
		{
			case 1:
				area = Geometry.areaCircle();
				break;
			case 2:
				area = Geometry.areaRectangle();
				break;
			case 3:
				area = Geometry.areaTriangle();
				break;
			case 4:
				break;
		}
		if (!(area<0))
			System.out.println("The area is " + area);
	}

	public static int ShapeChoice()
	{
		Scanner kb = new Scanner(System.in);
		int choice =-1;

		do
		{
			System.out.println("Geometry Calculator\n" +
				"1. Calculate the Area of a Circle\n" +
				"2. Calculate the Area of a Rectangle\n" +
				"3. Calculate the Area of a Triangle\n" +
				"4. Quit");
			System.out.print("Enter your choice: ");
			choice = kb.nextInt();
		} while (choice !=1 && choice !=2 && choice !=3 && choice!=4);

		return choice;
	}
}