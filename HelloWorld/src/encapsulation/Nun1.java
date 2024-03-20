package encapsulation;

public class Nun1 extends Nun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nun1 n= new Nun1();
		n.setName("Biju");
		System.out.println("Name : "+n.getName());
		
		n.setAge(22);
		System.out.println("Age : "+n.getAge());
	}

}
