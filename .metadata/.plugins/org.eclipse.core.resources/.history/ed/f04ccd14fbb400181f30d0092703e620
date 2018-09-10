package com.rk.trainings.designpatterns.structural.abstractfactory.pattern;

import com.rk.trainings.designpatterns.structural.abstractfactory.constants.AbstractFactoryConstants;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase(AbstractFactoryConstants.SHAPE)) {
			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase(AbstractFactoryConstants.COLOR)) {
			return new ColorFactory();
		}

		return null;
	}
}
