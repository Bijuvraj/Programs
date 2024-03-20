package exception;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a = 5/0;
			System.out.println(a);
		}
		catch(ArithmeticException z)
		{
			System.out.println(z);
		}
	}

}
