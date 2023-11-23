package mypackage;

public class Details {
	String name;
	int id;
	int salary;
	int age;
	Details(String name,int id,int salary)	
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	Details(String name,int id,int salary,int age)
	{
		//this.name = name;
		//this.id = id;
		//this.salary = salary;
		this(name,id,salary);
		this.age = age;
	}
	public void init()
	{
		//System.out.print("Name"+" "+"ID"+" "+"Salary"+" "+"Age");
		System.out.println(name+" "+id+" "+salary+" "+age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details obj = new Details("Biju",1,10000);
		Details obj1 = new Details("Arun",2,40000,27);
		obj.init();
		obj1.init();
		}

}
