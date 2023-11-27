package encapsulation;

public class SCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("Aju");
		System.out.println("Name : "+s.getName());
		
		Student s1 = new Student();
		s1.setStd(5);
		System.out.println("Std : "+s1.getStd());
		
		Student s2 = new Student();
		s2.setRollno(31);
		System.out.println("RollNo : "+s2.getRollno());
		
		Student s3 = new Student();
		s3.setPlace("Kazhakkootam");
		System.out.println("Place : "+s3.getPlace());
		
		

	}

}
