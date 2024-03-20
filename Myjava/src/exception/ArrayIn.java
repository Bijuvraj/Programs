package exception;

public class ArrayIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[] = {12,56,76,45,33,12};
			a[1] = 56;
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println(i);
		}
		finally
		{
			System.out.println("Exception Handled");
		}
	}

}
