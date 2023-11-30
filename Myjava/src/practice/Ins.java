package practice;

public class Ins {
	String a;
	Ins(String name)
	{
		a = name;
	}
	public void cv()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ins i = new Ins("Niju");
		i.cv();
	}

}
