package mypackage;

public class MethOver {
	//Method Overloading with Different DataType
	public static void a(String name)
	{
		System.out.println(name);
	}
	public static int a(int a,float f)
	{
		System.out.println(a+" "+f);
		//System.out.print(f);
		return a;
	}
	public static void a(char c,String name,int age)
	{
		System.out.println(c+" "+name+" "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a("Biju");
		a('V',"Biju",26);
		a(75,79.8f);
	}

}
