package interfaces;

public class Spacebar implements Space {
	public int multi(int a ,int b)
	{
		int c = a * b;
		System.out.println(c);
		return c;
	}
	public void show()
	{
		System.out.println("Multiplication");
	}
	public static void main(String args [])
	{
		Spacebar s = new Spacebar();
		s.multi(10, 399);
		s.show();
		
	}
}
