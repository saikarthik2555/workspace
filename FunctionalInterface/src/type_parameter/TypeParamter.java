package type_parameter;

import java.text.DecimalFormat;

public class TypeParamter {
public static void main(String[] args) {					//type parameter makes application independent
	Integer ans=new Accept<Integer>(250).getX();			//type
	System.out.println(ans);
	
	Double ansd=new Accept<Double>(12d).getX();
	System.out.println(ansd);
	
	Float ansf=new Accept<Float>(12f).getX();
	DecimalFormat df=new DecimalFormat(".000000");
	System.out.println(df.format(ansf));
	System.out.println(ansf);
	
	Customer c1=new Accept<Customer>(new Customer()).getX();
	System.out.println(c1.toString());
	}
}

class Accept<T> {
	private T x;
	public Accept(T x){
		this.x=x;
		
	}
	public T getX() {
		return	x;
	}
}