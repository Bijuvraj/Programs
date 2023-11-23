package mypackage;

public class Cat extends Animal{
	public void c()
	{
		System.out.println("Cat");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj = new Cat();
		obj.a();
		obj.c();
		Dog obj1 = new Dog();
		obj1.a();
		obj1.b();
	}

}
