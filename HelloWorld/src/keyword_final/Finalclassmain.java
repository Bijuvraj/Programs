package keyword_final;

public class Finalclassmain extends Finalclass{
	//Final class cannot extends to other
	public void dq()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalclassmain obj = new Finalclassmain();
		obj.z();
		obj.dq();
	}

}
