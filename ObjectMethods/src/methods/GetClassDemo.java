package methods;

public class GetClassDemo extends Object{
	public static void main(String[] args) {
		System.out.println(new GetClassDemo().getClass());
		System.out.println(new GetClassDemo().getClass().getName());
		System.out.println(new GetClassDemo().getClass().getClass());
		System.out.println(new GetClassDemo().getClass().getClassLoader().getName());
		System.out.println(new GetClassDemo().getClass().getSuperclass());
		
	}

}
