package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayMixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj = new ArrayList();
		obj.add(2);
		obj.add('h');
		obj.add("biju");
		obj.add(6.88f);
		obj.add(8);
		//System.out.println(obj);
		Iterator itr = obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			
	}

}
