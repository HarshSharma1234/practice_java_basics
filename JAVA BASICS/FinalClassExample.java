//program4(a)
//If the class is final we can not extends it..
//we can access the final class member by access through instantiation...
final class H
{
	int y = 67;
}

class FinalClassExample
{
}
{
	public static void main(String[] args) 
	{
		H u = new H();
		u.y = 45;
		System.out.println(u.y);
	}
}
