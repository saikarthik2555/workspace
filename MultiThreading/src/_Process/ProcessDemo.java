package _Process;

import java.io.IOException;
import java.lang.Process;

public class ProcessDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Process started ");
		Process pb2= new ProcessBuilder("mspaint.exe").start();
		Thread.sleep(3000);
		pb2.destroy();
		Process pb3= new ProcessBuilder("notepad.exe").start();
		Thread.sleep(3000);
		pb3.destroy();
		Process pb4= new ProcessBuilder("explorer.exe").start();
		Thread.sleep(3000);
		pb4.destroy();		
		System.out.println("Process destroyed");	
	}
}
