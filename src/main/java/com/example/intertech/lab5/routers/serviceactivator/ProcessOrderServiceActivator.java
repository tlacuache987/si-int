package com.example.intertech.lab5.routers.serviceactivator;

import com.example.intertech.lab4.transformers.schemas.shiporder.Shiporder;

public class ProcessOrderServiceActivator {

	public void processOrder(Shiporder shiporder) {
		System.out.println("Processing shiporder # " + shiporder.getOrderid());
		System.out.println("Shiporder: " + shiporder.toString());
	}

}
