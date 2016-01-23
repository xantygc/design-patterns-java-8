/**
 *
 */
package com.santy.observer.pattern.listener;

import com.santy.observer.pattern.domain.Animal;

/**
 * The listener interface for receiving animalAdded events. The class that is interested in processing a animalAdded event implements this
 * interface, and the object created with that class is registered with a component using the component's
 * <code>addAnimalAddedListener<code> method. When
 * the animalAdded event occurs, that object's appropriate
 * method is invoked.
 *
 * @author santy
 */
public interface AnimalAddedListener
{

	/**
	 * On animal added.
	 *
	 * @param animal
	 *            the animal
	 */
	public void onAnimalAdded(Animal animal);
}
