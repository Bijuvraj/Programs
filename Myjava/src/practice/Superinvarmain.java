package practice;

public class Superinvarmain extends Superinvar {
	int a = 7;
	public void v()
	{
		System.out.println("Child class Instance Variable : "+a);
		System.out.println("Parent calss Instance Variable : "+super.b);
		System.out.println("Parent Class Instance Variable : "+super.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superinvarmain obj = new Superinvarmain();
		obj.v();
	}

}
