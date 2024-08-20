package privatemethods;


@FunctionalInterface
abstract interface Inter1 {
	
	public void method();
	
	public default String about() {
		accsible();
		CannotAssible();
		check();
	return	"";
	}
	
	public static void accsible() {
		System.out.println("Im public static");
	}
	
	private static void CannotAssible() {
		System.out.println("Im private static");
	}
	
	private void check() {
		System.out.println("private non-static");
	}

}
