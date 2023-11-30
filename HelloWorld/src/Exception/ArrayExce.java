package Exception;

public class ArrayExce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]= {1,2,3,4,5,6};
			a[10]=8;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
