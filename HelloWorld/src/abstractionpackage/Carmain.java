package abstractionpackage;
import java.util.*;
public class Carmain extends Cars{
	public void model()
	{
		System.out.println();
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the First No : ");
		int a = obj.nextInt();
		
		Scanner obj1 = new Scanner(System.in);
		System.out.print("Enter the Second No : ");
		int b = obj1.nextInt();
		
		int c = a + b;
		System.out.println("Sum IS : "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carmain car = new Carmain();
		car.color();
		car.model();
		car.price();
	}

}
