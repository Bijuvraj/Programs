package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Honda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(6);
		n.add(64);
		n.add(55);
		n.add(87);
		n.add(11);
		System.out.println(n);
		for(int a:n)
		{
			System.out.println(a);
		}
		/* Iterator i = n.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		} */
	}

}
