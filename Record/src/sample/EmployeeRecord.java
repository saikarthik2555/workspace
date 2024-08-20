package sample;

public record EmployeeRecord(int id,String name,long phno) {

}
			//MAGIC
/*
 * F:\CmdPrgs\enum>javac EmployeeRecord.java
 * 
 * F:\CmdPrgs\enum>javap EmployeeRecord Compiled from "EmployeeRecord.java"
 * public final class EmployeeRecord extends java.lang.Record { public
 * EmployeeRecord(int, java.lang.String, long); public final java.lang.String
 * toString(); public final int hashCode(); public final boolean
 * equals(java.lang.Object); public int id(); public java.lang.String name();
 * public long phno();
 *  }
 */