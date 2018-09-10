package com.rk.trainings.designpatterns.creational.factory.service;

import com.rk.trainings.designpatterns.creational.factory.service.IShape;

public class Circle implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
