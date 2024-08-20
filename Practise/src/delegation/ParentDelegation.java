package delegation;

public class ParentDelegation {
	public static void main(String[] args) {
		Printer p=new Printer();				//delegation
		p.print();
	}
}
//You want to enhance A, but A is final and can no further be sub-classed then you need to use 
//composition  and delegation.
//You want functionality of a method and do not want to override the method then you should
//go for delegation.