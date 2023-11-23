package mypackage;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Biju ");
		s.append("V Raj");
		System.out.println(s);
		
		StringBuffer t = new StringBuffer("Biju ");
		t.insert(5,"v Raj");
		System.out.println(t);
		
		StringBuffer u = new StringBuffer("Java");
		u.replace(1, 3, "Lav");
		System.out.println(u);
		
		StringBuffer v = new StringBuffer("Java");
		v.delete(0, 2);
		System.out.println(v);
		
		StringBuffer w = new StringBuffer("Java");
		w.reverse();
		System.out.println(w);
	}

}
