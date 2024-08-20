package syn_multipleObj;

public class Test {		//Sunchronization logic will not work for multiple objects
	public static void main(String[] args) {
		
		Thread t1=new Thread("thread-1") {
			@Override
			public void run() {
				Table.printTable(1);
			}
		};
		Thread t2=new Thread("thread-2") {
			@Override
			public void run() {
				Table.printTable(2);	
			}
		};
		t1.start();  t2.start();
		
		Thread t3=new Thread("thread-3") {
			@Override
			public void run() {
				Table.printTable(3);
			}
		};
		Thread t4=new Thread("thread-4") {
			@Override
			public void run() {
				Table.printTable(4);
			}
		};
		t3.start(); t4.start();
	}
}
class Table{
	public static synchronized  void printTable(int num) {
		System.out.println(Thread.currentThread().getName());
		
			for(int i=1;i<=10;++i){
				System.out.println(i+" * "+num+" = "+(i*num));
			}
		
	}
}