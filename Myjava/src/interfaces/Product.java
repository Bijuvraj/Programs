package interfaces;

public class Product implements Pro,Prod{
	
	String Name;
	String company;
	int id;
	String color;
	int price;
	Product(String Name,String company,int id)
	{
		this.Name = Name;
		this.company = company;
		this.id = id;
	}
	Product(String color,int price)
	{
		this.color = color;
		this.price = price;
	}
	public int pro()
	{   
		//this("Nc","cc",3);
		System.out.print(Name+" "+company+" "+id+" ");
		return 0;
	}
	public int price()
	{
		System.out.println(color+" "+price);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product("Mobile","Samsung",97878879);
		Product p1 = new Product("Watch","Apple",345763876);
		
		Product c = new Product("Silver",69999);
		Product c1 = new Product("Black",35999);
		p.pro();
		c.price();
		p1.pro();
		c1.price();
	}

}
