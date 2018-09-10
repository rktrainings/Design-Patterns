/**
 * In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
 */
package com.rk.trainings.designpatterns.structural.factory.pattern;

import com.rk.trainings.designpatterns.structural.factory.constants.FactoryConstants;
import com.rk.trainings.designpatterns.structural.factory.service.IShape;
import com.rk.trainings.designpatterns.structural.factory.service.Circle;
import com.rk.trainings.designpatterns.structural.factory.service.Rectangle;
import com.rk.trainings.designpatterns.structural.factory.service.Square;

/**
 * @author RavikumarPothannagar
 * 
 */
public class ShapeFactory {

	// use getShape method to get object of type shape
	public IShape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase(FactoryConstants.CIRCLE)) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase(FactoryConstants.RECTANGLE)) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase(FactoryConstants.SQUARE)) {
			return new Square();
		}

		return null;
	}
}
