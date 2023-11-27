package polymorphism;

public class Samplemain {
	public int add(int d,int e)
	{
		int f = d+e;
		System.out.println("Sum : "+f);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samplemain obj= new Samplemain();
		obj.add(26, 34);
		
		Sample obj1 =new Sample();
		obj1.add(98,87);
	}

}
