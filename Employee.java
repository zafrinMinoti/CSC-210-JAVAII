public class Employee
{
	private String name;
	private String empNo;
	private int hiredDate;

	// Constructors
	public Employee()
	{

	}

	public Employee(String name, String empNo, int hiredDate)
	{
		if(isValidEmpNo(empNo)) {
			this.name = name;
			this.empNo = empNo + "-L";
			this.hiredDate = hiredDate;
		}
	}

	// Accessors
	public String getName()
	{
		return name;
	}

	public String getEmpNo()
	{
		return empNo;
	}

	public int getHireDate()
	{
		return hireDate;
	}

	// Mutators
	public void setName(String name)
	{
		this.name = name;
	}

	public void setEmpNo(String empNo)
	{
		if(isValidEmpNo(empNo)) {
			this.empNo = empNo;
		}
	}

	public void setHireDate(int hireDate)
	{
		this.hireDate = hireDate;
	}

	// Employee Number Validation
	private boolean isValidEmpNo(String empNo)
	{
		boolean valid = false;
		int checkIndex = 0;

		if(empNo.length()!=5)
			valid = false;
		if(empNo.charAt(3)=='-')
			valid = false;
		while(valid && checkIndex < 3) {
			valid = Character.isDigit(empNo.charAt(checkIndex));
			checkIndex++;
		}
		while(valid) {
			char c = empNo.charAt(4);
			if(c>='A' && c<='M')
				valid = true;
			else
				valid = false;
		}
		return valid;
	}
}