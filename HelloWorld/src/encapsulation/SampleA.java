package encapsulation;

public class SampleA extends Sample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleA obj = new SampleA();
		obj.setName("Biju");
		System.out.println("Name : "+obj.getName());
		obj.setAge(26);
		System.out.println("Age : "+obj.getAge());
	}

}
