// Zafrin Minoti
// CSC 210
// Homework 5

public class EmployeeProject 
{
    public static void main(String[] args) 
    {

        Employee emp1 = new Employee();
        ProductionWorker prod1 = new ProductionWorker();
        try
        {
            emp1.setDate("02/17/1876");
            emp1.setName("Steve");
            emp1.setId("556-2");
            prod1.setPayRate(-90);
            prod1.setShift(3);
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }      
    }    
}