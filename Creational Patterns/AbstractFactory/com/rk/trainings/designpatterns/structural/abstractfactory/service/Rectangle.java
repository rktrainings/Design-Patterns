package com.rk.trainings.designpatterns.structural.abstractfactory.service;

import com.rk.trainings.designpatterns.structural.abstractfactory.service.IShape;

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
