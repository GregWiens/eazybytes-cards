package com.eazybytes.cards.model;

public class Customer {

	private int customerId;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return String.format("Customer [customerId=%s]", customerId);
	}

}