package com.rk.trainings.designpatterns.creational.singleton.pattern;

/**
 * <b>Singleton Design Pattern | Introduction</b><br>
 * The singleton pattern is one of the simplest design patterns. Sometimes we
 * need to have only one instance of our class for example a single DB
 * connection shared by multiple objects as creating a separate DB connection
 * for every object may be costly. Similarly, there can be a single
 * configuration manager or error manager in an application that handles all
 * problems instead of creating multiple managers.
 * 
 * <br>
 * <br>
 * <b>Definition:</b> The singleton pattern is a design pattern that restricts
 * the instantiation of a class to one object. Let’s see various design options
 * for implementing such a class. If you have a good handle on static class
 * variables and access modifiers this should not be a difficult task.
 * 
 * <br>
 * <b>Method 1: Classic Implementation</b>
 * 
 * 
 * @author RavikumarPothannagar
 *
 */
public class SingleObject {

	private long objectId;

	private SingleObject(long objectId) {
		this.objectId = objectId;
	}

	// create an object of SingleObject
	private static SingleObject instance = new SingleObject(System.nanoTime());

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
	}

	// Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

	public void showObjectId() {
		System.out.println("SingleObject Id:" + objectId);
	}
}
