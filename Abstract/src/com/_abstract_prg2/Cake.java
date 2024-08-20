package com._abstract_prg2;

public abstract class Cake {
	private String shapeType;
	private String flavourType;
	private int qtyType;
	protected Cake(String shapeType, String flavourType, int qtyType,String message) {
		super();
		this.shapeType = shapeType;
		this.flavourType = flavourType;
		this.qtyType = qtyType;
	}
	protected Cake(String shapeType, String flavourType, int qtyType) {
		super();
		this.shapeType = shapeType;
		this.flavourType = flavourType;
		this.qtyType = qtyType;
	}
	public String getShapeType() {
		return shapeType;
	}
	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}
	public String getFlavourType() {
		return flavourType;
	}
	public void setFlavourType(String flavourType) {
		this.flavourType = flavourType;
	}
	public int getQtyType() {
		return qtyType;
	}
	public void setQtyType(int qtyType) {
		this.qtyType = qtyType;
	}
	
	protected void showCake() {
		System.out.println(" A "+shapeType+" cake of "+qtyType+" kg/kg's Ready @ "+400*qtyType);
	}
	
	
	
}
