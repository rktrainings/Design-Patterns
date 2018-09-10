/**
 * FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object. It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.
 */
package com.rk.trainings.designpatterns.structural.factory.demo;


import com.rk.trainings.designpatterns.structural.factory.constants.FactoryConstants;
import com.rk.trainings.designpatterns.structural.factory.pattern.ShapeFactory;
import com.rk.trainings.designpatterns.structural.factory.service.IShape;

/**
 * @author RavikumarPothannagar
 *
 */
public class FactoryPatternDemo{

	   public static void main(String[] args) {
		      ShapeFactory shapeFactory = new ShapeFactory();

		      //get an object of Circle and call its draw method.
		      IShape cricle = shapeFactory.getShape(FactoryConstants.CIRCLE);

		      //call draw method of Circle
		      cricle.draw();

		      //get an object of Rectangle and call its draw method.
		      IShape rectangle = shapeFactory.getShape(FactoryConstants.RECTANGLE);

		      //call draw method of Rectangle
		      rectangle.draw();

		      //get an object of Square and call its draw method.
		      IShape square = shapeFactory.getShape(FactoryConstants.SQUARE);

		      //call draw method of square
		      square.draw();
		   }

}
