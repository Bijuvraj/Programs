package mypackage;

public class MethodOverloading {
	//Method Overloading with Same DataType
	public static void add(int a)
	{
		System.out.println(a);
	}
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void add(int e,int f)
	{
		System.out.println(e+f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(2);
		add(2,5,8);
		add(9,10);
	}

}
