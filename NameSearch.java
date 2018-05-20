import java.io.*;
import java.util.Scanner;

public class NameSearch
{
	public static void main(String[] args) throws IOException
	{
		// Declare variables
		final int NUM_NAMES = 200;
		String nameToSearch;
		String nameToSearch2;
		int typeToSearch;
		boolean found = false;
		String[] girlNames = new String[NUM_NAMES];
		String[] boyNames = new String[NUM_NAMES];

		// store names in arrayes
		readNames("GirlNames.txt", girlNames);
		readNames("BoyNames.txt", boyNames);

		// search for name input by user
		ask();
		found = searchName(nameToSearch, typeToSearch);
		if (found) {
			System.out.println("The name is among the most common");
		}
		else {
			System.out.println("The name is not the most common");
		}
	}

	// Method to read file
	public static void readNames(String filename, String[] array)
	{
		int NUM = 200;
		String name;
		File file = new File(filename);			// open the file
		Scanner nameFile = new Scanner(file);	// allow to read from file
		for (int i=0; i<NUM; i++)
			name = nameFile.nextLine();// Read lines
			// System.out.print(name);
			array[i] = name;
		nameFile.close();
	}

	// Method to search for name in a file
	public static boolean searchName(String name, int nameType)
	{
		boolean found = false;
		switch (nameType)
		{
		case 1:
			for (int i=0; i<NUM_NAMES; i++) {
				if (boyNames[i] == name) {
					found = true;
					break;
				}
			break;
			}
		case 2:
			for (int i=0; i<NUM_NAMES; i++) {
				if (girlNames[i] == name) {
					found = true;
					break;
				}
			break;
			}
		}
		return found;
	}

	// Method to ask for manes
	public static void ask()
	{
		Scanner kb = new Scanner(System.in);

		// get the type of name from user
		System.out.println("Would you like to search for\n" +
			"a boy name or a girl name? or both?");
		System.out.println("\tEnter:\n\t1. Boy name\n" +
			"\t2. Girl Name\n\t3. both");
		System.out.print("Enter your choice: ");
		typeToSearch = kb.nextInt();

		// get the name(s) for user
		System.out.print("Enter the name: ");
		nameToSearch = kb.nextLine();

		if (typeToSearch == 3) {
			System.out.print("Enter the second name: ");
			nameToSearch2 = kb.nextLine();
		}
	}
	
}