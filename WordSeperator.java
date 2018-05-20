/**
 * @author Zafrin Minoti (zafrin.minoti@gmail.com)
 * @date April 12, 2018
 * @title Lottery Classfile
 * Book - Starting Out with Java, 6e
 * Chapter 9 - Problem # 14
 * CSC 210 - Computer Programming 2
 * Prof. Persaud
 */

import java.util.Scanner;

public class WordSeperator
{
	/**
		Main method
	*/
	public static void main(String[] args)
	{
		String str = getString();
		str = seperate(str);
		System.out.println("\nSeperated:\n" + str);
	}

	/**
		getString method gets an string from user
		@return a string
	*/
	public static String getString()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a string you wish to seperate:");
		return kb.nextLine();
	}

	/**
		seperate method adds an space between words that 
		are not seperated but capitalized
		@param str an string to the seperated
		@return outputStr a seperated sting where only the 1st letter is capitalized
	*/
	public static String seperate(String str)
	{
		String outputStr = ""+Character.toUpperCase(str.charAt(0));
		for(int i=1; i<str.length(); i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
				outputStr += " " + Character.toLowerCase(str.charAt(i));
			else
				outputStr += str.charAt(i);
		}
		return outputStr;
	}


}