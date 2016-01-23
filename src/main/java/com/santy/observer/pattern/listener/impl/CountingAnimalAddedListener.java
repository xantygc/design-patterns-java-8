/**
 *
 */
package com.santy.observer.pattern.listener.impl;

import com.santy.observer.pattern.domain.Animal;
import com.santy.observer.pattern.listener.AnimalAddedListener;

/**
 * The listener interface for receiving countingAnimalAdded events. The class that is interested in processing a countingAnimalAdded event
 * implements this interface, and the object created with that class is registered with a component using the component's
 * <code>addCountingAnimalAddedListener<code> method. When
 * the countingAnimalAdded event occurs, that object's appropriate
 * method is invoked.
 *
 * @author santy
 */
public class CountingAnimalAddedListener implements AnimalAddedListener
{

	/** The animals added count. */
	private static int animalsAddedCount = 0;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.santy.observer.pattern.listener.AnimalAddedListener#onAnimalAdded(com.santy.observer.pattern.domain.Animal)
	 */
	@Override
	public void onAnimalAdded(Animal animal)
	{

		animalsAddedCount++;
		System.out.println("Total animals added: " + animalsAddedCount);

	}

}
