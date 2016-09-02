package com.example.intertech.lab7.enrichers.serviceactivator.enricher;

import com.example.intertech.lab7.enrichers.schemas.shiporder.Shiporder;

public class ShiporderTotalComputer {

	public double computeTotal(Shiporder shiporder) {

		double sum = 0;

		sum = shiporder.getItem().stream().map(i -> i.getPrice().doubleValue() * i.getQuantity().intValue()).reduce(0D,
				(i, j) -> i + j);

		return sum;
	}
}
