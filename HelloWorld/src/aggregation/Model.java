package aggregation;

public class Model {
	String Carname;
	String color;
	int power;
	int price;
	Car car;
	Model(String Carname,String color,int power,int price,Car car)
	{
		this.Carname = Carname;
		this.color = color;
		this.power = power;
		this.price = price;
		this.car = car;
	}
	
	public void a()
	{
		System.out.print(Carname+" "+color+" "+power+" "+price+" ");
		System.out.println(car.company+" "+car.state+" "+car.showroom+" "+car.place);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Suzuki","TN","EVM","Chennai");
		Car car1 = new Car("Honda","KL","Derik","Kazhzkootam");
		
		Model m = new Model("Alto","White",800,400000,car);
		Model m1 = new Model("Jimny","Green",1200,800000,car1);
		m.a();
		m1.a();
	}

}
