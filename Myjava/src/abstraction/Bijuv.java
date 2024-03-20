package abstraction;

public class Bijuv extends Biju{
	public int show()
	{
		for(int i = 1;i <= 10; i++)
		{
			System.out.print(i+" ");
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bijuv v = new Bijuv();
		s();
		v.show();
		
	}

}
