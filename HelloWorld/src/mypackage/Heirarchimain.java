package mypackage;

public class Heirarchimain extends Heirarchi {
	public void un()
	{
		System.out.println(" Attinkuzhi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heirarchi obj1 = new Heirarchi();
		obj1.in();
		Heirar obj2 = new Heirar();
		obj2.an();
		Heirarchimain obj = new Heirarchimain();
		obj.un();
		//obj.an();
	}

}
