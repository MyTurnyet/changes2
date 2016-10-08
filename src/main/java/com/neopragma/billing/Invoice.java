package com.neopragma.billing;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
	
	private List<LineItem> lineItems;
	private double total;
	
	public Invoice() {
		this.lineItems = new ArrayList<LineItem>();
	}

	public void add(LineItem lineItem) {
		lineItems.add(lineItem);
		total += (lineItem.getQuantity() * lineItem.getAmount());
	}
	
	public double getTotal() {
		return total;
	}

	public int count() {
		return lineItems.size();
	}

}
