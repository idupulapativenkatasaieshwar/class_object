package class_object;
import java.util.*;
public class One {
	double h,w,d;

    One(double width,double height,double depth)
   {
       h=height;
       w=width;
       d=depth;
   }
   double volume()
   { double v;
   v=h*w*d;
   return v;
   }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double h=sc.nextDouble();
		double w=sc.nextDouble();
	    double d=sc.nextDouble();	
		 One bc = new One(h,w,d);
		    System.out.println(bc.volume());		

	}

}

   
  