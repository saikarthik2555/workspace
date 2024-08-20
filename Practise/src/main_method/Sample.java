package main_method;

import java.io.IOException;

public class Sample {
	public static void main(String[] args) {
		System.out.println(args[0]+args[1]);
	}

}

class LangPackagePrdeinedWords{
	public static void main(String[] args) throws IOException, InterruptedException {
		ProcessBuilder pb= new ProcessBuilder("calC.exe");
		Process p=pb.start();
		System.out.println("Process started ");
		System.out.println("waiting");
		Thread.sleep(1000);
		p.destroy();
		System.out.println(p.exitValue());
		System.out.println("Process destroyed");	
	}
}
