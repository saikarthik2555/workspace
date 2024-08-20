package com.prg.size;

import java.io.File;
public class SizeOfPdf {
	public static void main(String[] args) {
		File resume=new File("F:\\Resume\\Sai Karthik Resume.pdf");
		Long bytes=resume.length();
		System.out.println("My Resume in Bytes : "+bytes);
		System.out.println("My Resume in Kilobytes : "+bytes/1024);
		System.out.println("My Resume in MegaBytes : "+((bytes/1024)/1024));
		
	}

}
