package _RuntimeProcess;

import java.lang.Process;

public class RunTimeDemo {
	public static void main(String[] args) throws Exception {
		String []app=new String[2];
		app[0]= "notepad.exe";
		app[1]="example2.txt";					//like this I want to do edit++ app 
										//See below program
		
			
		Process p=Runtime.getRuntime().exec(app);		
		//in runtime it does not ask or example file. I only assigns
		
//		Process p1=new ProcessBuilder("notepad.exe").start();
//		Process p2=new ProcessBuilder("example3.txt").start();		//error
		
		
	}
}

/*
 * public class Sample { public static void main(String[] args) { String
 * []app=new String[2]; app[0]= "notepad.exe"; app[1]="example2.txt"; try {
 * 
 * // Process p=Runtime.getRuntime().exec(app); 
 * Process p1=new ProcessBuilder("notepad.exe").start();
 * 
 * Process p2=new ProcessBuilder("example3.txt").start();
 *  if(p2.isAlive()) {
 * Thread.sleep(3000); Process p3=Runtime.getRuntime().exec("mspaint.exe");
 * }else { p1.destroy();
 * System.out.println("Without payment no access to Edit ++"); }
 * System.out.println("Thank You"); }catch(Exception e) { e.printStackTrace(); }
 * } }
 */