package creatingthread;

public class No_refVariableThread {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
			System.out.println("Child thread "+Thread.currentThread().getName());	
			}
		}.start();
	}

}
