/**
 * 
 */
package com.rk.trainings.designpatterns.creational.singleton.pattern.classicimplementation;

/**
 * <b>Method 1: Classic Implementation</b> <br>
 * <br>
 * Here we have declared getInstance() static so that we can call it without
 * instantiating the class. The first time getInstance() is called it creates a
 * new singleton object and after that it just returns the same object. Note
 * that Singleton obj is not created until we need it and call getInstance()
 * method. This is called lazy instantiation. The main problem with above method
 * is that it is not thread safe. Consider the following execution sequence.
 * <br>
 * <br>
 * This execution sequence creates two objects for singleton. Therefore this
 * classic implementation is not thread safe
 * 
 * @author RavikumarPothannagar
 *
 */
public class Singleton {

	private static Singleton obj;

	// private constructor to force use of
	// getInstance() to create Singleton object
	private Singleton() {
	}

	public static Singleton getInstance() {
		if (obj == null)
			obj = new Singleton();
		return obj;
	}
}
