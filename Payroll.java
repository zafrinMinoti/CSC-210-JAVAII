public class Payroll
{
	// Fields
	private int[] employeeID = {5658845, 4520125, 7895122, 8777541,
							8451277, 1302850, 7580489};;
	
	private final int SIZE = 7;
	private double[] hours = new double[SIZE];
	private double[] payRate = new double[SIZE];
	private double[] wages = new double[SIZE];

	// Constructors


	// Mutators
	public void setHours(int empID, double hr) {
		for (int i=0; i<employeeID.length; i++) {
			if (empID == employeeID[i])
				hours[i] = hr;
		}
	}

	public void setPayRate(int empID, double rate) {
		for (int i=0; i<employeeID.length; i++) {
			if (empID == employeeID[i])
				payRate[i] = rate;
		}
	}

	public void setWages() {
		for (int i=0; i<employeeID.length; i++) {
			wages[i] = payRate[i] * hours[i];
		}
	}

	// Accessors
	public int[] getEmpID() {
		return employeeID;
	}

	public double getHours(int empID) {
		double hr = -1;
		for (int i=0; i<employeeID.length; i++) {
			if (empID == employeeID[i])
				hr = hours[i];
		}
		return hr;
	}

	public double wage(int empID) {
		double w = -1;
		for (int i=0; i<employeeID.length; i++) {
			if (empID == employeeID[i])
				w = hours[i] * payRate[i];
		}
		return w;
	}
}