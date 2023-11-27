package aggregation;

public class Details {
	String name;
	int rno;
	Student student;
	Details(String name,int rno,Student student)
	{
		this.name = name;
		this.rno = rno;
		this.student = student;
		
	}
	public void det()
	{
		System.out.print(name+" "+rno+" ");
		System.out.println(student.std+" "+student.division+" "+student.language);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student(3,'c',"Malayalam");
		Student b = new Student(5,'b',"Tamil");
		Student c = new Student(6,'f',"Hindi");

		Details s1 = new Details("Biju",1,a);
		Details s2 = new Details("Aju",2,b);
		Details s3 = new Details("ciju",4,c);
		
		s1.det();
		s2.det();
		s3.det();
	}

}
