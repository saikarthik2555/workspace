package com.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputRead {
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fout=new FileOutputStream("F:\\download\\File\\check.txt");
			try(fout;){
			String str="FileOutputStream is an outputstream for writing data/streams of raw bytes to file or storing data to file. FileOutputStream is a subclass of OutputStream. To write primitive values into a file, we use FileOutputStream class. For writing byte-oriented and character-oriented data, we can use FileOutputStream but for writing character-oriented data, FileWriter is more preferred.";
			
			byte[] b=str.getBytes();
			for(int i=0;i<b.length;i++) {
				fout.write(b[i]);
			}

			System.out.println("Completed");
			}//end of try with resources
			
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		}//end of try catch
	}
}
