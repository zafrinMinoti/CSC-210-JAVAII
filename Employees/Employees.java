// Zafrin Minoti
// CSC 210
// Homework 5

public class Employees 
{
    private String name, id, date;
    
    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(String id) throws InvalidEmployeeNumber 
    {
        if(Character.isAlphabetic(id.charAt(0)) || 
            Character.isAlphabetic(id.charAt(1)) ||
            Character.isAlphabetic(id.charAt(2))){
            throw new InvalidEmployeeNumber();
        }

        else if(id.charAt(3) != '-'){
            throw new InvalidEmployeeNumber();
        }

        else if(!Character.isAlphabetic(id.charAt(4))){
            throw new InvalidEmployeeNumber();
        }

        else if(id.length() < 5){
            throw new InvalidEmployeeNumber();
        }
        
        this.id = id;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public String getDate()
    {
        return date;
    }
    
}

// exception class to validate employee numbers
class InvalidEmployeeNumber extends Exception
{
    public InvalidEmployeeNumber()
    {
        super("You entered an invalid employee number.\n\ Try again.");
    }
}