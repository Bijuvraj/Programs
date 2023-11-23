package mypackage;

public class Polb extends Pola {
	public void in(int c,int d)
	{
		System.out.println(c+" "+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polb a = new Polb();
		a.in(9, 0);
		Pola b = new Pola();
		b.in(1, 8);
	}

}
