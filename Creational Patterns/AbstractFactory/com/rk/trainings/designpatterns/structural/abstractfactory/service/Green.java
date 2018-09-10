package com.rk.trainings.designpatterns.structural.abstractfactory.service;

public class Green implements IColor {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
