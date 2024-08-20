package using_3techniques;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable{
	private String code;
	private String name;
	private int price;
	private int qty;
	public ProductBean() {
		
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
}
