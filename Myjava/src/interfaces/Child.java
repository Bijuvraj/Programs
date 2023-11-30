package interfaces;

public class Child implements Parent{
	public int add(int a,int b)
	{	int c = a+b;
	System.out.println(c);
	return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.add(6,75);
	}

}
