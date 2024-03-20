package collection;

import java.util.HashSet;
import java.util.Set;

public class Fly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set f = new HashSet();
		f.add('f');
		f.add("Fly");
		f.add(43);
		f.add(9.00f);
		
		System.out.println(f);
		
		
		//f.clear();
		//System.out.println(f.contains("Fly"));
		
		System.out.println(f.isEmpty());
		System.out.println(f.size());
		
	}

}
