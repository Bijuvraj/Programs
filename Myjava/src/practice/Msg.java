package practice;
import java.util.*;
public class Msg {

	public String name()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Queries : ");
		long a = sc.nextLong();
		
		/*Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter your Queries : ");
		int b = sc1.nextInt();*/
		if(a == 0)
		{
			System.out.println("This Is a String");
		}
		else if(a == 0)
		{
			System.out.println("this is a Integer");
		}
		else 
		{
			System.out.println("Invalid");
		}
		return " ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Msg o = new Msg();
		o.name();
	}

}
