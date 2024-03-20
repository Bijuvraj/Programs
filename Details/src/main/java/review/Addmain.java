package review;

public class Addmain extends Add {
	public int add(int a,int b)
	{
		int c = a+b;
		System.out.println("Addition : "+c);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addmain a = new Addmain();
		a.add(12, 23);
		a.sub(100, 99);
		Add.div(4,2);
	}

	

}
