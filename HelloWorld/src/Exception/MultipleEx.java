package Exception;

public class MultipleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a= 1/0;
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException s)
		{
			System.out.println(s);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
	}

}
