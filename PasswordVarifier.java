/**
 * @author Zafrin Minoti (zafrin.minoti@gmail.com)
 * @date April 12, 2018
 * @title Lottery Classfile
 * Book - Starting Out with Java, 6e
 * Chapter 9 - Problem # 5
 * CSC 210 - Computer Programming 2
 * Prof. Persaud
 */

import java.util.Scanner;

public class PasswordVarifier
{
	/**
		Main method
	*/
	public static void main(String[] args)
	{
		String password = getPassword();
		while(!isValid(password))
		{
			p("\nSorry! You entered an invalid password.");
			p("Please try again...\n");
			password = getPassword();
		}
		p("Congrats!!! You now have an amazon.com account!");
	}

	/**
		getPassword method gets an string from user
		@return a string
	*/
	public static String getPassword()
	{
		Scanner kb = new Scanner(System.in);

		p("Guideline for password:");
		p("The password should be at least six characters long.");
		p("The password should contain at least one uppercase and at least one lowercase letter.");
		p("The password should have at least one digit.");
		p("Enter a password:");
		return kb.nextLine();
	}

	/**
		p method is a shorthand for printing out a string
		@param s is a string
	*/
	public static void p(String s)
	{
		System.out.println(s);
	}

	/**
		isValid method checkes if a string is a valid password
		@param len boolean variable keeps track of the password length being within spacification
		@param cap boolean variable keeps track of the password having capitalized letter
		@param small boolean variable keeps track of the password having small case letter
		@param num boolean variable keeps track of the password having a digit
		@param valid boolean variable keeps track of the password meeting all spacification
		@return valid returns true if password spacifications are met or it returns false
	*/
	public static boolean isValid(String str)
	{
		boolean len = false;
		boolean cap = false;
		boolean small = false;
		boolean num = false;
		boolean valid = false;

		char[] pieces = str.toCharArray();

		if(!(pieces.length<6))
		{
			len = true;
			for(int i=0; i<pieces.length; i++)
			{
				if(Character.isLowerCase(pieces[i])) 
					cap = true;
				else if(Character.isUpperCase(pieces[i])) 
					small = true;
				else if(Character.isDigit(pieces[i])) 
					num = true;
	
				if(len && cap && small && num)
					valid = true;
					break;
			}
		}
		return valid;
	}
}