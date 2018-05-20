/**
 * @author Zafrin Minoti (zafrin.minoti@gmail.com)
 * @date April 12, 2018
 * @title Lottery Classfile
 * Book - Starting Out with Java, 6e
 * Chapter 9 - Problem # 3
 * CSC 210 - Computer Programming 2
 * Prof. Persaud
 */

import java.util.Scanner;

public class SentenceCapitalizer
{
	/**
		Main method
	*/
	public static void main(String[] args)
	{
		String str = getString();
		str = capitalize(str);
		System.out.println("\nCapitalized:\n" + str);
	}

	/**
		getString method gets an string from user
		@return a string
	*/
	public static String getString()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a string you wish to capitalize:");
		return kb.nextLine();
	}

	/**
		capitalize method capitalize the first letter of each sentense
		@param str an string to be capitalized
		@return outputStr a sting where only the 1st letter of each sentense is capitalized
	*/
	public static String capitalize(String str)
	{
		String outputStr = ""+Character.toUpperCase(str.charAt(0));
		for(int i=1; i<str.length(); i++)
		{
			if((str.charAt(i)=='.') && (Character.isSpaceChar(str.charAt(i+1))))
			{
				outputStr += str.charAt(i) +
							 Character.toUpperCase(str.charAt(i+1));
				i++;
			}
			else 
			{
				outputStr += str.charAt(i);
			}
		}
		return outputStr;
	}


}