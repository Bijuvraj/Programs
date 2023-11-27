package mypackage;

public class Multi3 extends Multi2{
	public void an()
	{
		System.out.print(" Programming Language");
	}

	public static void main(String[] args) {
		Multi obj2 = new Multi();
		obj2.an();
		
		Multi2 obj1 = new Multi2();
		obj1.an();
		
		Multi3 obj = new Multi3();
		obj.an();
	}

}
