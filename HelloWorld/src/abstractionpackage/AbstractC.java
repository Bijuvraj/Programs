package abstractionpackage;

public class AbstractC extends AbstractB {
	public void g()
	{
		System.out.println("Bey");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractC obj = new AbstractC();
		obj.g();
		obj.c();
		obj.d();
	}

}
