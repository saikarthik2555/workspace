package com.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSalary {
	public static void main(String[] args) {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		try {
			String sal=b.readLine();
			Float salary=Float.parseFloat(sal);		//need ParseFloat
			System.out.println(salary);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
