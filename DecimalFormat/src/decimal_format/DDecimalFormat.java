package decimal_format;

import java.text.DecimalFormat;

class Circle{
	public static double getArea(double rad) {
		final double PI=3.14;
		return PI*rad*rad;
	}
}
public class DDecimalFormat{	//make sure the class name is not DecimalFormat
	public static void main(String[] args) {
		double rad=12.57;
		double area=Circle.getArea(rad);
		//double areaReal=Double.parseDouble(area);
		DecimalFormat df=new DecimalFormat("000.0000000000000");
		DDecimalFormat d=new DDecimalFormat();
		
		System.out.println(df.format(area));
		
	}
}