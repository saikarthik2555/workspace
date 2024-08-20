package com.senario_MtCc;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProductCatalog { 
	public static void main(String[] args) {
	Map<String,Product> prct=new LinkedHashMap<>();
	prct.put("Clothes", new Product("denim jeans", 2999d));
	prct.put("Groceries", new Product("Oil", 999d));
	prct.put("Electronics", new Product("Xiaomi TV",27000d));	
	
			}
}
