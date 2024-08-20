package com.record_mcqs;

public class Sub {
private int a;
private int b;
public Sub(int a,int b) {
	this.a=a;
	this.b=b;
}
public int getA() {
	return a;
}

public int getB() {
	return b;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + a;
	result = prime * result + b;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Sub other = (Sub) obj;
	if (a != other.a)
		return false;
	if (b != other.b)
		return false;
	return true;
}
@Override
public String toString() {
	return "Sub [a=" + a + ", b=" + b + "]";
}



}
