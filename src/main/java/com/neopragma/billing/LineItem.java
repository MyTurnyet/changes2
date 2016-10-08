package com.neopragma.billing;

public class LineItem {
	
	private String SKU;
	private int quantity;
	private double price;

	public LineItem(String SKU, int quantity, double unitPrice) {
		this.SKU = SKU;
		if (quantity > 0) this.quantity = quantity;
			else throw new RuntimeException("Quantity must be greater than zero.");
		this.price = unitPrice;
	}

	public double getAmount() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}
	
	public String getSKU() {
		return SKU;
	}

}
