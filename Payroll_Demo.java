import java.util.Scanner;

public class Payroll_Demo
{
	public static void main(String[] args)
	{
		Payroll febPayroll = new Payroll();
		int[] empIDs = getEmpID();
		Scanner kb = new Scanner(System.in);

		//
		for (i=0; i<empIDs.length; i++) {
			System.out.print("Enter pay rate for Employee % : ", empIDs[i]);
			double pr = kb.nextDouble();
			setHours(empIDs[i], pr);

			System.out.print("Enter hours for Employee % : ", empIDs[i]);
			double hr = kb.nextDouble();
			setHours(empIDs[i], hr);
		}

		//
		System.out.println("Here are the wages of the employees:");
		for(int i=0; i<febPayroll.length; i++) {
			System.out.print("Employee % : $%",empIDs[i],wage[i])
		}
	}
}