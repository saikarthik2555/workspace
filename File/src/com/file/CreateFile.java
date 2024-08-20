package com.file;

import java.io.File;

public class CreateFile {
	public static void main(String[] args) throws Exception{
		
		File resumepdf=new File("F:\\Resume\\Sai Karthik Resume.pdf");
		try {
			if(resumepdf.exists()) {
				System.out.println("Resume exists");
			}else {
				System.out.println("Not Found");
			}
			if(resumepdf.createNewFile()) {
				System.out.println("Created with Name : "+resumepdf.getName());
			}else {
				System.out.println("Not Created because already exists with Name : "+resumepdf.getName());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
