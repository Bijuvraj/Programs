package collection_;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListnotype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();
		a.add('a');
		a.add("vip");
		a.add(0.01f);
		
		Iterator i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
