package com.example.intertech.lab5.transformers.serviceactivator;

import com.example.intertech.lab5.transformers.schemas.shiporder.Shiporder;

public class PrinterServiceActivator {

	public void voidPrintShiporder(Shiporder order) {
		System.out.println("Order: " + order);
	}

	public Shiporder printShiporder(Shiporder order) {
		System.out.println("Order: " + order);
		return order;
	}

}
