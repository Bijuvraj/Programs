package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Zooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList b = new ArrayList();
		b.add("Jio");
		b.add('Y');
		b.add(222.89d);
		b.add(1.99f);
		b.add(78);
		b.add("n");
		System.out.println(b);
		Iterator a = b.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
	}

}
