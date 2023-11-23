package encapsulation;

public class SampleA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		obj.setName("Biju");
		System.out.println("Name : "+obj.getName());
		obj.setAge(26);
		System.out.println(obj.getAge());
	}

}
