package excle_read;

import java.io.IOException;

public class Exclemain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String b = Excle.getStringData(0,0);
		String c = Excle.geIntegerData(0,1);
		//System.out.println(Excle.getStringData(0,0));
		//System.out.println(Excle.geIntegerData(0,1));
		System.out.println(b);
		System.out.println(c);
	}

}
