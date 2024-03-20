package constructor;

public class Construct {
	Construct()
	{
		System.out.println("Hello");
		
	}
	Construct(String name)
	{
		name = "Biju";
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construct c = new Construct();
		Construct c1 = new Construct("NIN");
		
	}

}
