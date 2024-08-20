package com.exam_mcqs;
//Checked Exception
public class SmartHomeDevice {
	private String type;
	private boolean status;
	public SmartHomeDevice(String type, boolean status) {
		super();
		this.type = type;
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void turnOn() throws DeviceAlreadyOnException{
		if(status==true) {
			throw new DeviceAlreadyOnException("Device is Already On ");
		}
		else {
			System.out.println("Turing on Device");
			status=true;
			System.out.println(toString());
			
		
		}
		}
	public void turnOff()  throws DeviceAlreadyOffException{
		if(status==true) {
			throw new DeviceAlreadyOffException("Device is already Off ");
		}
		else {
			System.out.println("Turing off Device");
			System.out.println(toString());
			status=true;

			
		}
		
	}
	@Override
	public String toString() {
		return "SmartHomeDevice [" + type + ", status=" + status + "]";
	}
	
}

class DeviceAlreadyOnException extends ClassNotFoundException{
	public DeviceAlreadyOnException() {
		
	}
	public DeviceAlreadyOnException(String message) {
		super(message);
	}
}
class DeviceAlreadyOffException extends ClassNotFoundException{
	public DeviceAlreadyOffException() {
		
	}
	public DeviceAlreadyOffException(String message) {
		super(message);
	}
}