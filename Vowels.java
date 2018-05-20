public class Vowels;
{
	String input;

	// Constructor
	public Vowel(String input)
	{
		this.input = input;
	}

	public int countVowels()
	{
		char c;
		int count = 0;
		for(int i=0; i<input.length(); i++)
		{
			c = input.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count++;
		}
		return count;
	}
}