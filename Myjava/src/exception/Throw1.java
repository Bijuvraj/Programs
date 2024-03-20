package exception;

import java.util.Scanner;

public class Throw1 {
	public int a(int w)
	{
		if(w < 19)
		{
			throw new ArithmeticException("Not Eligibe For Driving Licence");
		}
		else
		{
			System.out.println("You Are Eligible For Dirving Licence");
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter Your Age : ");
		int e =sc.nextInt();
		Throw1 t = new Throw1();
		t.a(e);
		
	}

}
