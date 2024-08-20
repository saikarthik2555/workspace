package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWriteOperation {
	public static void main(String[] args) throws IOException {
			FileInputStream fin=new FileInputStream("F:\\Resume\\Sai Karthik Resume.pdf");
			File resumepdf=new File("F:\\Resume\\Sai Karthik Resume.pdf");
			System.out.println("Total Bytes in resumepdf are : "+resumepdf.length());
		try(fin;){
			try {
			int i=0,count=0;
			while(true) {
				i=fin.read();
				if(i==-1) {		//read it retunds -1 if no data available
					break;
				}else {
					//System.out.print((char)i);
					count++;
				}
			}
			System.err.println("One Word/character is equal to 1 byte :"+count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	}

}
