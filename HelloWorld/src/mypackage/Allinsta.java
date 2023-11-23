package mypackage;

public class Allinsta {
	String name;
	int id;
	int m1;
	int m2;
	int m3;
	int sum;
	Allinsta(String name,int id,int m1,int m2,int m3)
	{
		this.name = name;
		this.id = id;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.sum = m1+m2+m3;
	}
	public void mark()
	{
		System.out.println(name+" "+id+" "+m1+" "+m2+" "+m3+" "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Allinsta obj = new Allinsta("BIJU",1,66,87,98);
		obj.mark();
	}

}
