package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Say {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new LinkedHashSet();
		s.add(8);
		s.add("gee");
		s.add(null);
		s.add(3.0000f);
		s.add(99.0900d);
		
		/*Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		Set a = new LinkedHashSet();
		a.add('a');
		a.add("LinkedHashSet");
		a.add(19);
		
		//s.addAll(a);
		s.removeAll(a);
		
		System.out.println(s);
		System.out.println(s.size());
		
}

}
