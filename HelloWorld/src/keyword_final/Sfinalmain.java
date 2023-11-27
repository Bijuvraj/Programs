package keyword_final;

public class Sfinalmain extends Sfinal{
	//Final method cannot override to other class 
	public void add()
	{
		System.out.println("Python");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sfinalmain obj = new Sfinalmain();
		obj.add();
		Sfinal obj1 = new Sfinal();
		obj1.add();
	}

}
