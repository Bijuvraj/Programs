package exception;

public class NumberFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			String s = "Biju";
			int e =Integer.parseInt(s);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			
		}
		catch(NumberFormatException c)
		{
			System.out.println("The Number Format Exception Is Handled");
			System.out.println(c);
			
		}
	}

}
