package com.rk.trainings.designpatterns.structural.abstractfactory.pattern;

import com.rk.trainings.designpatterns.structural.abstractfactory.service.IColor;
import com.rk.trainings.designpatterns.structural.abstractfactory.service.IShape;

/**
 * @author RavikumarPothannagar
 * 
 */
public abstract class AbstractFactory {
	public abstract IColor getColor(String color);

	public abstract IShape getShape(String shape);
}
