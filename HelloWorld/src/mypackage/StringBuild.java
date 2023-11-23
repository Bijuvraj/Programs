package mypackage;

public class StringBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s=new StringBuilder("Biju ");
		s.append("V Raj");
		System.out.println(s);
		
		StringBuilder t = new StringBuilder("Biju ");
		t.insert(5,"v Raj");
		System.out.println(t);
		
		StringBuilder u = new StringBuilder("Java");
		u.replace(1, 3, "Lav");
		System.out.println(u);
		
		StringBuilder v = new StringBuilder("Java");
		v.delete(0, 2);
		System.out.println(v);
		
		StringBuilder w = new StringBuilder("Java");
		w.reverse();
		System.out.println(w);
	}

}
