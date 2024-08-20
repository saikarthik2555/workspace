package float_methods;

public class FloatMethods {
	public static void main(String[] args) {
		Float f=12789.45f;
		System.out.println(f.TYPE);
		System.out.println(f.MAX_EXPONENT);
		System.out.println(f.MIN_EXPONENT);
		System.out.println(f.toHexString(f));
		System.out.println(f.intValue());
		System.out.println(f.floatValue());
		System.out.println(f.doubleValue());
		System.out.println(f.shortValue());
		System.out.println(f.byteValue());
	}
}
