package interThreadCommunication;

public class Demo {
	public static void main(String[] args) throws InterruptedException{
		Test t=new Test();
		new Thread(t).start();
		Thread.sleep(200);
		System.out.println(t.count);
	}
}
class Test implements Runnable{
	int count=0;
	@Override
	public void run() {
		for(int i=1;i<=100;++i) {
			count=count+i;
			try {
			Thread.sleep(200);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}