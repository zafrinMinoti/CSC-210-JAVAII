public class B extends A
{
	public int methodOfA(int i)
	{
		i*=20;
		return methodOfA(i);
	}
}