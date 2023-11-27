package aggregation;

public class Employee {
	String name;
	int id;
	Address address; //create reference object of first class
	Employee(String name,int id,Address address)
	{
		this.name = name;
		this.id = id;
		this.address  = address; //refer 
		
	}
	public void emp()
	{
		System.out.println(name+" "+id);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1 = new Address("Attinkuzhi","TVM","India");
		Address address2 = new Address("Kazhakootam","KLM","India");
		
		Employee employe1 = new Employee("Shiji",101,address1);
		Employee employe2 = new Employee ("Jiji",102,address2);
		employe1.emp();
		employe2.emp();
	}

}
