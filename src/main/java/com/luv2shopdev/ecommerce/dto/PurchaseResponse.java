package com.luv2shopdev.ecommerce.dto;

public class PurchaseResponse {

	private final String orderTrackingNumber = "";

	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}
	

	public PurchaseResponse(String orderTrackingNumber) {
		super();
		 
	}


	@Override
	public String toString() {
		return "PurchaseResponse [orderTrackingNumber=" + orderTrackingNumber + "]";
	}

}
