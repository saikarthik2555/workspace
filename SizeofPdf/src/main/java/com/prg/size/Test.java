package com.prg.size;
import java.io.File;

public class Test {
    public static void main(String[] args) {
       File f= new File("E:\\canva\\Sai Karthik Resume.pdf");
       Long length=f.length();
     
       Double kilobytes=(double)length/1024;
       Double megabytes=kilobytes/1024;
       System.out.println("Total Bytes : "+length);
       System.out.println("In kilobyes : "+kilobytes);
       System.out.println("In megabytes : "+megabytes);
    }
}