package interface_;

public class Winner implements Win {
	public void a()
	{
		System.out.println("Python");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Winner w = new Winner();
		w.a();
		Wins w1 = new Wins();
		w1.a();
		Win in = new Winner();
		in.a();
	}

}
