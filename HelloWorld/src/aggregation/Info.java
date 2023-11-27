package aggregation;

public class Info {
	String Sname;
	int age;
	String Blood;
	College college;
	Info(String Sname,int age,String Blood,College college)
	{
		this.Sname= Sname;
		this.age = age;
		this.Blood = Blood;
		this.college = college;
	}
	public String m()
	{
		System.out.print(Sname+" "+age+" "+Blood+" ");
		System.out.println(college.name+" "+college.Dept);
		return " ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College("MCC","B.Sc.Comp");
		College c1 = new College("NMCC","MCA");
		
		Info i = new Info("Biju",22,"A+",c);
		Info i2 = new Info("Anit",23,"B-",c1);
		i.m();
		i2.m();
	}

}
