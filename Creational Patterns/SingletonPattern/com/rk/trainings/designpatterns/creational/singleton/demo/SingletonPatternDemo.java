/**
 * 
 */
package com.rk.trainings.designpatterns.creational.singleton.demo;

import com.rk.trainings.designpatterns.creational.singleton.pattern.SingleObject;

/**
 * @author RavikumarPothannagar
 *
 */
public class SingletonPatternDemo {
	  public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object1 = SingleObject.getInstance();

	      //show the object id
	      object1.showObjectId();
	      
	      
	      SingleObject object2 = SingleObject.getInstance();
	      object2.showObjectId();
	      
	      SingleObject object3 = SingleObject.getInstance();
	      object3.showObjectId();
	      
	      
	   }
}
