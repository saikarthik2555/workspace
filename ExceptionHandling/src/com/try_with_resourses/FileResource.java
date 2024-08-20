package com.try_with_resourses;

public class FileResource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		
		System.out.println("FileResource Ended");
	}

	

}
