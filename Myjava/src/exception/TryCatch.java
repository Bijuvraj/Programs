package exception;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a = 1*0/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
