package methods;

public class Methods {
	public static void main(String[] args) {
		Integer i=123;
		System.out.println(i.MAX_VALUE);
		System.out.println(i.MIN_VALUE);
		System.out.println(i.TYPE);
		System.out.println(i.SIZE);//in bits
		System.out.println(i.BYTES);//in bytes
		int a=12,b=15;
		String d="12";
		String c=Integer.toString(a,2);	//user friendly number format
		System.out.println(c);
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toOctalString(b));
		System.out.println(Integer.toHexString(b));
		//System.out.println(Integer.parseInt(d, 2));	//exception
		int r=1234567;
		System.out.println(Integer.reverse(a));		//?
		System.out.println(Integer.sum(12, 12));
		System.out.println(Integer.max(12, 45));
		System.out.println(Integer.min(56,89));
		System.out.println(Integer.bitCount(r));	//binary format-> 1's
		System.out.println(Integer.rotateLeft(r, 2)); 	//?
		Double g=new Integer(12).doubleValue();	//integer to Double
		System.out.println(g);
		byte f=new Integer(12).byteValue();	//intger to byte
		System.out.println(f);
		int shortt=32768;
		System.out.println(new Integer(shortt).shortValue());//to short
		
	}

}
