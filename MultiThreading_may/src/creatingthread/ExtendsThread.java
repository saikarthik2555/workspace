package creatingthread;

public class ExtendsThread {
	public static void main(String[] args) {
		Thread t=new Thread("child-0") {
			@Override
			public void run() {
				System.out.println("child thread "+Thread.currentThread().getName());
			}
		};
		System.out.println("current thread "+Thread.currentThread().getName());
		t.start();
	}
}
