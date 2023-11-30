package Exception;

public class NumberOutof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String a = "biju";
			int i = Integer.parseInt(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}
