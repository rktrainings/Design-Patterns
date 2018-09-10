package com.rk.trainings.designpatterns.creational.abstractfactory.service;

import com.rk.trainings.designpatterns.creational.abstractfactory.service.IShape;

public class Circle implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
