package com.exam_mcqs;
//Checked Exceptions
public class Alexa {
	public static void main(String[] args) throws Exception{
		SmartHomeDevice alexa=new SmartHomeDevice("Smart Light",false);
		alexa.turnOn();
		alexa.turnOn();		//leads to exception
		alexa.setStatus(false);
		alexa.turnOff();
		alexa.turnOff();		//leads to exception
		
//Even you dont write try and catch or throws unchecked are handled by JVM 
//-> if you want to show that message of JVM provided for client convient use try and catch
//but in case of checked we must handle either try catch or throws for PREDEFINED  and USERDEFINES	
//by try catch or throws(for every caller method)
//->		
	}

}
