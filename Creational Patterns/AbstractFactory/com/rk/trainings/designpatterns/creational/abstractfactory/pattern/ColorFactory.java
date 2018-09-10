package com.rk.trainings.designpatterns.creational.abstractfactory.pattern;

import com.rk.trainings.designpatterns.creational.abstractfactory.constants.AbstractFactoryConstants;
import com.rk.trainings.designpatterns.creational.abstractfactory.service.Blue;
import com.rk.trainings.designpatterns.creational.abstractfactory.service.Green;
import com.rk.trainings.designpatterns.creational.abstractfactory.service.IColor;
import com.rk.trainings.designpatterns.creational.abstractfactory.service.IShape;
import com.rk.trainings.designpatterns.creational.abstractfactory.service.Red;

/**
 * @author RavikumarPothannagar
 * 
 */
public class ColorFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shapeType) {
		return null;
	}

	@Override
	public IColor getColor(String color) {

		if (color == null) {
			return null;
		}

		if (color.equalsIgnoreCase(AbstractFactoryConstants.RED)) {
			return new Red();

		} else if (color.equalsIgnoreCase(AbstractFactoryConstants.GREEN)) {
			return new Green();

		} else if (color.equalsIgnoreCase(AbstractFactoryConstants.BLUE)) {
			return new Blue();
		}

		return null;
	}

}
