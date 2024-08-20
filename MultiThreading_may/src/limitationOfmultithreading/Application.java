package limitationOfmultithreading;

public class Application {
	public static void main(String[] args) {
		Bank b=new Bank();
		Runnable r=()->{
		String responce=b.withdraw(14000);
		System.out.println(responce);
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
	}

}
class Bank{
	 int bal=20000;
	public String withdraw(int wtd) {
	//	return bal+" ";
		if(wtd<=bal) {
			bal=bal-wtd;
			return "transaction Successul and remaining bal :"+bal;
		}else {
			return "InSufficient fund";
		}
	}
}
