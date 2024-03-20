package collection;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> f = new ArrayList<Float>();
		f.add(6.09f);
		f.add(5.0f);
		f.add(2.99f);
		f.add(0.99f);
		//System.out.println(f);
		for(float a :f)
		{
			System.out.println(a);
		}
	}

}
