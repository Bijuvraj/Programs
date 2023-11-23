package mypackage;

public class SingleChild extends SingleCParent {
	public void c()
	{
		System.out.print(" Raj");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild obj = new SingleChild();
		obj.a();
		obj.b();
		obj.c();
	}

}
