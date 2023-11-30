package Exception;

public class Finally1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a = 4/2;
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
