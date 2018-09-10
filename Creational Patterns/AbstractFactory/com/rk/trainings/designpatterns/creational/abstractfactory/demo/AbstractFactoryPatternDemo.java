package com.rk.trainings.designpatterns.creational.abstractfactory.demo;

import com.rk.trainings.designpatterns.creational.abstractfactory.constants.AbstractFactoryConstants;
import com.rk.trainings.designpatterns.creational.abstractfactory.pattern.AbstractFactory;
import com.rk.trainings.designpatterns.creational.abstractfactory.pattern.FactoryProducer;
import com.rk.trainings.designpatterns.creational.abstractfactory.service.IColor;
import com.rk.trainings.designpatterns.creational.abstractfactory.service.IShape;

/**
 * AbstractFactoryPatternDemo, our demo class uses FactoryProducer to get a
 * AbstractFactory object. It will pass information (CIRCLE / RECTANGLE / SQUARE
 * for Shape) to AbstractFactory to get the type of object it needs. It also
 * passes information (RED / GREEN / BLUE for Color) to AbstractFactory to get
 * the type of object it needs.
 * 
 * @author RavikumarPothannagar
 * 
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {

		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer
				.getFactory(AbstractFactoryConstants.SHAPE);

		// get an object of Shape Circle
		IShape circle = shapeFactory.getShape(AbstractFactoryConstants.CIRCLE);

		// call draw method of Shape Circle
		circle.draw();

		// get an object of Shape Rectangle
		IShape rectangle = shapeFactory
				.getShape(AbstractFactoryConstants.RECTANGLE);

		// call draw method of Shape Rectangle
		rectangle.draw();

		// get an object of Shape Square
		IShape square = shapeFactory.getShape(AbstractFactoryConstants.SQUARE);

		// call draw method of Shape Square
		square.draw();

		// get color factory
		AbstractFactory colorFactory = FactoryProducer
				.getFactory(AbstractFactoryConstants.COLOR);

		// get an object of Color Red
		IColor red = colorFactory.getColor(AbstractFactoryConstants.RED);

		// call fill method of Red
		red.fill();

		// get an object of Color Green
		IColor green = colorFactory.getColor(AbstractFactoryConstants.GREEN);

		// call fill method of Green
		green.fill();

		// get an object of Color Blue
		IColor blue = colorFactory.getColor(AbstractFactoryConstants.BLUE);

		// call fill method of Color Blue
		blue.fill();
	}
}
