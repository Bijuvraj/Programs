package abstractionpackage;

public abstract class Cars extends Car{
	abstract public void model();
	
	public void color()
	{
		char a[]= {'P','i','n','k'};
		for(int i=0;i < a.length;i++)
		{
			System.out.print(a[i]);
			
		}
	}
	

}
