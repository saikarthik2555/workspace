package com.mcqs;

import com.functional_interface.Consumer;

public class Program09 {
	public static void main(String[] args) {
		Consumer<String> value = (a) -> System.out.println(a.toLowerCase());
		value.accept("NareshIT");
	}
}