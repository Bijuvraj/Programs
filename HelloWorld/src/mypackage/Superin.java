package mypackage;

public class Superin extends Superof {
	int a = 9;
	//int b;
	public void in()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superin obj = new Superin();
		obj.in();
	}

}
