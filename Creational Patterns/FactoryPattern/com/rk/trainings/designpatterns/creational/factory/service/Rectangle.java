package com.rk.trainings.designpatterns.creational.factory.service;

import com.rk.trainings.designpatterns.creational.factory.service.IShape;

/**
 * @author RavikumarPothannagar
 * 
 */
public class Rectangle implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
