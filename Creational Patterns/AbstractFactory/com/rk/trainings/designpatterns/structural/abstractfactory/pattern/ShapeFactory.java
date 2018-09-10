package com.rk.trainings.designpatterns.structural.abstractfactory.pattern;

import com.rk.trainings.designpatterns.structural.abstractfactory.constants.AbstractFactoryConstants;
import com.rk.trainings.designpatterns.structural.abstractfactory.service.Circle;
import com.rk.trainings.designpatterns.structural.abstractfactory.service.IColor;
import com.rk.trainings.designpatterns.structural.abstractfactory.service.IShape;
import com.rk.trainings.designpatterns.structural.abstractfactory.service.Rectangle;
import com.rk.trainings.designpatterns.structural.abstractfactory.service.Square;

/**
 * @author RavikumarPothannagar
 * 
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase(AbstractFactoryConstants.CIRCLE)) {
			return new Circle();

		} else if (shapeType
				.equalsIgnoreCase(AbstractFactoryConstants.RECTANGLE)) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase(AbstractFactoryConstants.SQUARE)) {
			return new Square();
		}

		return null;
	}

	@Override
	public IColor getColor(String color) {
		return null;
	}

}
