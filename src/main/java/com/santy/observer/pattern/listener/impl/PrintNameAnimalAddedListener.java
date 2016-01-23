/**
 *
 */
package com.santy.observer.pattern.listener.impl;

import com.santy.observer.pattern.domain.Animal;
import com.santy.observer.pattern.listener.AnimalAddedListener;

/**
 * @author santy
 *
 */
public class PrintNameAnimalAddedListener implements AnimalAddedListener
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.santy.observer.pattern.listener.AnimalAddedListener#onAnimalAdded(com.santy.observer.pattern.domain.Animal)
	 */
	@Override
	public void onAnimalAdded(Animal animal)
	{
		System.out.println("Added a new animal with name '" + animal.getName() + "'");

	}

}
