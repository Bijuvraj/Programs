package review;

public class Multimain extends Employee{
	public int m(int a,int b)
	{
		System.out.println("parent class instance variable : "+super.o);
		int c = a*b;
		System.out.println("Multiplication :"+c);
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multimain i = new Multimain();
		i.e("Biju", 110000);
		i.m(6, 8);
	}

}
