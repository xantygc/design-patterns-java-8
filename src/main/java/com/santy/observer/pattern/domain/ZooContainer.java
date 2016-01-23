/**
 *
 */
package com.santy.observer.pattern.domain;

import com.santy.observer.pattern.listener.AnimalAddedListener;

/**
 * @author santy
 *
 */
public class ZooContainer implements AnimalAddedListener
{

	private final Zoo zoo = new Zoo();

	public ZooContainer()
	{
		this.zoo.registerAnimalAddedListener(this);
	}

	public Zoo getZoo()
	{
		return this.zoo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.santy.observer.pattern.listener.AnimalAddedListener#onAnimalAdded(com.santy.observer.pattern.domain.Animal)
	 */
	@Override
	public void onAnimalAdded(Animal animal)
	{
		System.out.println("Added animal with name '" + animal.getName() + "'");

	}

}
