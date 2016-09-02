package com.example.intertech.lab6.routers.serviceactivator.router;

import org.springframework.messaging.Message;

import com.example.intertech.lab5.transformers.schemas.shiporder.Shiporder;

public class ShiporderTypeRouter {

	public String routeShipOrder(Message<Shiporder> shiporder) {
		System.out.println("Routing income shiporder ...");
		return shiporder.getPayload().getShipto().getCountry().equalsIgnoreCase("usa") ? "usa" : "norway";
	}

	/*public String routeShipOrder(Shiporder shiporder) {
		System.out.println("Routing income shiporder ...");
		return shiporder.getShipto().getCountry().equalsIgnoreCase("usa")
				? "to-object-shiporder-type-usa-to-xml-transformer"
				: "to-object-shiporder-type-norway-to-xml-transformer";
	}*/
}
