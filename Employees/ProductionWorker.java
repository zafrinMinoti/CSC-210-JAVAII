// Zafrin Minoti
// CSC 210
// Homework 5

public class ProductionWorker extends Employee
{
    private int shift;
    private double payRate;
    
    public void setShift(int shift) throws InvalidShift
    {
        if(shift != 1 && shift != 2)
        {
            throw new InvalidShift();
        }
        this.shift = shift;
    }

    public void setPayRate(double payRate) throws InvalidPayRate
    {
        if(payRate < 0)
        {
            throw new InvalidPayRate();
        }
        
        this.payRate = payRate;
    }

    public int getShift()

    {
        return shift;
    }

    public double getPayRate()
    {
        return payRate;
    }
}

//Invalid shfit exception class
class InvalidShift extends Exception 
{
    public InvalidShift()
    {
        super("Invalid shift. Try again");
    }
}

// Exception class for 
class InvalidPayRate extends Exception
{
    public InvalidPayRate()
    {
        super("Invalid pay rate. Try again");
    }
}