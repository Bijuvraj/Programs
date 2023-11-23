package mypackage;

public class Supoverchild extends Supover {
	public void in()
	{
		super.in();
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supoverchild obj = new Supoverchild();
		obj.in();
		
	}

}
