package mypackage;

public class Detail {
	Detail(int a)
	{
		int b = a *a;
		System.out.println("Area Of Square :"+b);
	}
	public static void details(String name,int age)
	{
		System.out.println("Student Details");
		System.out.println(name+" "+age);
		
	}
	public static void details(float salary,float bonus)
	{
		float total=salary + bonus;
		System.out.println("Employee Details");
		System.out.println(salary+" "+bonus);
		System.out.println("Total :"+total);
		
	}
	public void add(float a ,float b)
	{
		float c = a + b;
		System.out.println("Add two Float Number");
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Detail obj = new Detail(4);
		obj.details("Biju",26);
		obj.details(10000, 20000);
		obj.add(100000, 99900);
	}
	

}
