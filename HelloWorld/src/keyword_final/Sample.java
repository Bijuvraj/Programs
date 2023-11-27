package keyword_final;

public class Sample {
	final int a = 2;
	public void as()
	{
		//final int a = 23;
		int a = 10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		obj.as();
		
	} 

}
