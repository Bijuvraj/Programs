package mypackage;

public class PolyC extends PolyB {
	public void a()
	{
		System.out.print("va");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyA obj1 = new PolyA();
		obj1.a();
		PolyB obj2 = new PolyB();
		obj2.a();
		PolyC obj = new PolyC();
		obj.a();
	}

}
