package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set q = new LinkedHashSet();
		q.add(8);
		q.add("gee");
		q.add(null);
		q.add(3.0000f);
		
		System.out.println(q);
		//q.clear();
		//System.out.println(q);
		//System.out.println(q.isEmpty());
		q.remove(null);
		System.out.println(q);
		
		
	}

}
