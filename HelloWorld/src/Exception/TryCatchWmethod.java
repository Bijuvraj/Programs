package Exception;

public class TryCatchWmethod {
	public void a()
	{
		try
		{
			int a = 4/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchWmethod s = new TryCatchWmethod();
		s.a();
	}

}
