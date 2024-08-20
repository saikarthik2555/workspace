package com.try_with_resourses;

import java.io.*;
import java.io.IOException;
public class Welcome implements Closeable{
	public  void close() throws IOException{
		System.out.println("Have a nice day ");
	}

	
}
