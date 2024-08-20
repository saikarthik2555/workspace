package linkedList;

import java.util.Comparator;

public class Product implements Comparator<Product>{//<Generics>Mandatory
	private Integer pid;
	private String pname;
	private Double price;
	public Product(Integer pid,String pname,Double price) {
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	
	public Integer getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public Double getPrice() {
		return price;
	}

	

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	@Override
	public int compare(Product p1, Product p2) {
	
		return p1.pid-p2.pid;
	}

	
	
}
