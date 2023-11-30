package interface_;

public class Multichild implements Multi,Multi1 {
	public void show()
	{
		System.out.println("Java");
		
	}
	public void add()
	{
		System.out.println("Core java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multichild m = new Multichild();
		m.show();
		m.add();
		
	}

}
