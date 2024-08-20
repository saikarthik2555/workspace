package com.function_interface;

//import java.util.function.Function;
interface Function<String,Boolean>{
	public abstract Boolean apply (String str);
}




public class FunctionDemo1 {
	public static void main(String[] args) {
		Function<String,Boolean> funType= str -> str.equals("abc@123");
		System.out.println(funType.apply("abc@123"));
		Function<String,Boolean> funType1= str -> str.startsWith("a");
		System.out.println(funType1.apply("abc@123"));
	}
}
