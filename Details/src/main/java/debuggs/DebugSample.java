package debuggs;

public class DebugSample {
	public void print()
	{
		System.out.println("Instance Method");
	}
	public void show()
	{
		System.out.println("Debugging");
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		DebugSample obj = new DebugSample();
		obj.print();
		obj.show();
	}

}
