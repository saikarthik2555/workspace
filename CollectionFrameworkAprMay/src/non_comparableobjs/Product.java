package non_comparableobjs;

public class Product{
	private int value;
	
	public Product(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Product [value=" + value + "]";
	}

	
	
}
