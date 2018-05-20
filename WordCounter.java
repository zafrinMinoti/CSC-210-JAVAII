public class WordCounter
{
	public static void main(String[] args)
	{
		s = "How are you";
		System.out.println("There are " + countWords(s) +
			" words in the string");
	}

	public static int countWords(String str)
	{
		String[] words = str.split(" ");
		return words.length;
	}
}