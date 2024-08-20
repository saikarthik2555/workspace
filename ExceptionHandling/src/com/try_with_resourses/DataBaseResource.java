package com.try_with_resourses;

import java.io.Closeable;

import java.io.IOException;

public class DataBaseResource implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("DataBaseResourse Ended");
		
	}

}
