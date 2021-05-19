package class_object;
public class Three {
	String name="Idupulapati venkata sai eshwar";
	double height=1.8;
	double weight=80.2;
	double computeBmi()
	{
		double ans=weight/(height*height);
		return ans;
	}
	public static void main(String[]args)
	{
		Three p=new Three();
	    System.out.println(p.name);
	    System.out.println(p.height);
	    System.out.println(p.weight);
	    System.out.println(p.computeBmi());
	}
	

}