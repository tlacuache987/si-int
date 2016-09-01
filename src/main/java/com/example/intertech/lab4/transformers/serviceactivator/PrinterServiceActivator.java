package com.example.intertech.lab4.transformers.serviceactivator;

import com.example.intertech.lab4.transformers.schemas.shiporder.Shiporder;

public class PrinterServiceActivator {

	public Shiporder printShiporder(Shiporder order) {
		System.out.println("Order: " + order);
		return order;
	}

}
