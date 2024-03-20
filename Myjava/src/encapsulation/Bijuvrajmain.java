package encapsulation;

public class Bijuvrajmain extends Bijuvraj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bijuvrajmain m = new Bijuvrajmain();
		//Bijuvraj m = new Bijuvraj();
		m.setFirstName("Biju ");
		m.setMidName('V');
		
		System.out.print(m.getFirstName());
		System.out.println(m.getMidName());
	}

}
