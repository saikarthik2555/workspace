package methods;

public class CloneDemo1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c1=new Customer();
		c1.id=12;
		c1.name="sai";
		Customer c2=(Customer)c1.clone();
		System.out.println(c1+"  "+c2);
		System.out.println(c1.hashCode()+" -- different hashcode -- "+c2.hashCode());
		c2.id=123;
		c2.name="rohit";
		System.out.println(c1+"  "+c2);
		System.out.println(c1.hashCode()+" -- different hashcode -- "+c2.hashCode());
		
	}

}
class Customer extends Object implements Cloneable{
	int id;
	String name;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
}