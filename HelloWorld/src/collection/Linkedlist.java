package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l = new LinkedList();
		l.add('l');
		l.addFirst("Biju");
		l.add(55);
		
		l.add(11.00f);
		l.addLast('r');
		
		
		
		Iterator i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(l.indexOf(55));
		
	}

}
