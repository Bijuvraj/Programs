package interface_;

public class Add2 implements Add,Add1 {
	public void add()
	{
		System.out.println("Hiiii");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add2 a = new Add2();
		a.add();
		
	}

}
