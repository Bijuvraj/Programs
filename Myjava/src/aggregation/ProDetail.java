package aggregation;

public class ProDetail {
	String prodCompany;
	int rating;
	Aggregation aggregation;
	ProDetail(String prodCompany,int rating,Aggregation aggregation)
	{
		this.prodCompany = prodCompany;
		this.rating = rating;
		this.aggregation = aggregation;
	}
	public void name()
	{ 
		System.out.print(prodCompany+" "+rating+" ");
		System.out.println(aggregation.prod+" "+aggregation.prodName+" "+aggregation.prodId+" "+aggregation.prodColor+" "+aggregation.prodPrice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation p = new Aggregation("Elaectrinics","TV",989887989,"Gray",19999);
		Aggregation p1 = new Aggregation("Electronics","Laptop",6566767,"Black",55999);
		
		ProDetail a = new ProDetail("Onida",9,p);
		ProDetail a1 = new ProDetail("Dell",8,p1);
		a.name();
		a1.name();
	}

}
