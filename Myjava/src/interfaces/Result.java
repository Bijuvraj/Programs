package interfaces;

public class Result implements Add,Sub
{
	public int add(int a ,int b)
	{
		int c = a+b;
		System.out.println(c);
		return c;
		
	}
	public int sub(int c,int d)
	{
		int e = c+d;
		System.out.println(e);
		return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Result r = new Result();
			r.add(17555, 7665);
			r.sub(9876667, 100000);
	}

}
