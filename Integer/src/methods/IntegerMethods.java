package methods;

public class IntegerMethods {
	/*
	 *
	 *ValueOf my favt.
	 * System.out.println(Integer.bitCount(a));
	int v=a.intValue();
	int c=Integer.compare(a, b);  	//1 0 -1
int result=Integer.compareUnsigned(c, d);		//opposite to compare
//more priority to negative value
String s="0X122";
int r=Integer.decode(s);
int c=Integer.divideUnsigned(a, b); //not for negative values
	 */
	public static void main(String[] args) {
		String a="25";
		int b=Integer.parseInt(a,8);
		int c=Integer.parseUnsignedInt(a,8);
		System.out.println(b);
		System.out.println(c);
		System.out.println(Integer.valueOf(a, 8));
		System.out.println(Integer.compare(b, c));
	}

}
