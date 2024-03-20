package review;

public abstract class Add {
	public abstract int add(int a,int b);
	public int sub(int a ,int b)
	{
		int c = a-b;
		System.out.println("Subtraction : "+c);
		return 0;
	}
	public static int div(int c,int d)
	{
		int f = c/d;
		System.out.println("Division : "+f);
		return 0;
		
	}
}
