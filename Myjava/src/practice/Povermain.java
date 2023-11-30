package practice;

public class Povermain {
	public int a()
	{
		System.out.println("PODA");
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Povermain obj = new Povermain();
		obj.a();
		Polyoverride obj1 = new Polyoverride();
		//System.out.println(obj1.a());
		obj1.a();
	}

}
