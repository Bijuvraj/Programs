package Exception;

public class Throw {
	public void in(int age)
	{
		if(age < 13)
		{
			throw new ArithmeticException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw t = new Throw();
		t.in(13);
		t.in(20);
		t.in(5);
		t.in(16);
	}

}
