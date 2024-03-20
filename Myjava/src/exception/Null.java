package exception;

public class Null {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String s = null;
			System.out.println(s.length());
			
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
			System.out.println("The Arithmetic Eception Is Handled");
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println(b);
			System.out.println("The Array index Out Of Bounds Exception Is Handled");
		}
		catch(NullPointerException c)
		{
			System.out.println(c);
			System.out.println("The NullPointer Exception Is Handled");
		}
	}

}
