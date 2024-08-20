package practise;

public class Sample {
	public static void main(String[] args) {
		Season x=Season.SUMMER;
	//	Season x=Season.WINTER;
		String msg=x.getMessage();
		System.out.println(msg);
	}
}
enum Season{
	SUMMER("Unpleasent"),RAIN("Rainy"),WINTER(),SPRING("Pleasent");
	String msg;
	
	Season() {
		this.msg="winter";
	}

	Season(String msg) {
		this.msg=msg;
	}
	
	public String getMessage() {
		return this.msg;
	}
}

//class SUMMER{							//Assumption
//	public SUMMER(String msg) {
//		super(msg);
//	}
//	
//}