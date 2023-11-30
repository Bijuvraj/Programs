package encapsulation;

public class Encapsemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encaps obj= new Encaps();
		obj.setName("Biju");
		System.out.println("Name : "+obj.getName());
		obj.setAge(26);
		System.out.println("Age : "+obj.getAge());
		obj.setPlace("Pkl");
		System.out.println("Place : "+obj.getPlace());
		
		Encaps obj1 = new Encaps();
		obj1.setName("Arun");
		System.out.println("Name : "+obj1.getName());
		obj1.setAge(30);
		System.out.println("Age : "+obj1.getAge());
		obj1.setPlace("Tvm");
		System.out.println("Place : "+obj1.getPlace());
		
		Encaps obj2 = new Encaps();
		obj2.setName("Ceen");
		System.out.println("Name : "+obj2.getName());
		obj2.setAge(27);
		System.out.println("Age : "+obj2.getAge());
		obj2.setPlace("Pld");
		System.out.println("Place : "+obj2.getPlace());
	}

}
