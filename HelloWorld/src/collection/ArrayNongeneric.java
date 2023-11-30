package collection;

import java.util.ArrayList;

public class ArrayNongeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList n = new ArrayList();
		n.add("Hi");
		n.add(100000f);
		n.add('n');
		n.add(90);
		//n.remove(1);
		//int a = n.size();
		n.add(2,"biju");
		//System.out.println(a);
		System.out.println(n);
		System.out.println(n.contains("Hi"));
	}

	

}
