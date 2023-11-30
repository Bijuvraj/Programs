package Exception;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a = 4/0;
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}
