package practice;

public class Polymorfmain extends Polymorf{
	public void a(float height)
	{
		System.out.println("Height : "+height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorfmain obj = new Polymorfmain();
		obj.a();
		obj.a("Biju","TvM");
		obj.a(178.9f);
		obj.a(26);
	}

}
