package com._abstract_prg2;

public class OrderedCake extends Cake{
	private String message;
	

	public OrderedCake() {
		super("round","vanilla",1);
	}		
	public OrderedCake(String shapeType,String flavourType,int qtyType,String message) {
		super(shapeType,flavourType,qtyType);
		this.message=message;
	}
	public OrderedCake(String shapeType,String flavourType,int qtyType) {
		super(shapeType,flavourType,qtyType);
	}
	@Override
	protected void showCake() {
		if(this.message==null) {
			super.showCake();
		}
		else {
		System.out.println(" A "+getShapeType()+" cake of "+getQtyType()+" kg/kg's Ready with message "+this.message+" @ "+getQtyType()*400);
		}
		}


}
