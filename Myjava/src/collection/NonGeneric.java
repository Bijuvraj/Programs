package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList m = new ArrayList();
		m.add("Name : "+"Biju");
		m.add("Age : "+26);
		m.add("Height : "+178.3f);
		m.add("Weight : "+80.5d);
		//System.out.println(m);
		Iterator i = m.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
