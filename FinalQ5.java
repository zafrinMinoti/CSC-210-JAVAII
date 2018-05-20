public class FinalQ5
{
	public static void main(String[] args)
	{
		String givenString = "1234";

		System.out.println(getSum(givenString));
	}

	public static int getSum(String s)
	{
		int sum = 0;
		for(int i=0; i<s.length(); i++) {
			sum += Integer.parseInt(
				Character.toString(s.charAt(i)));
		}
		return sum;
	}
}