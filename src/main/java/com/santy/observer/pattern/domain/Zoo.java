/**
 *
 */
package com.santy.observer.pattern.domain;

import java.util.ArrayList;
import java.util.List;

import com.santy.observer.pattern.listener.AnimalAddedListener;

/**
 * The Class Zoo.
 *
 * @author santy
 */
public class Zoo
{

	/** The animals. */
	private final List<Animal> animals = new ArrayList<Animal>();

	/** The listeners. */
	private final List<AnimalAddedListener> listeners = new ArrayList<AnimalAddedListener>();

	/**
	 * Register animal added listener.
	 *
	 * @param listener
	 *            the listener
	 */
	public void registerAnimalAddedListener(AnimalAddedListener listener)
	{
		this.listeners.add(listener);
	}

	/**
	 * Unregister animal added listener.
	 *
	 * @param listener
	 *            the listener
	 */
	public void unregisterAnimalAddedListener(AnimalAddedListener listener)
	{
		this.listeners.remove(listener);
	}

	/**
	 * Notify animal added listeners.
	 *
	 * @param animal
	 *            the animal
	 */
	protected void notifyAnimalAddedListeners(Animal animal)
	{
		this.listeners.forEach(listener -> listener.onAnimalAdded(animal));
	}

	/**
	 * Adds the animal.
	 *
	 * @param animal
	 *            the animal
	 */
	public void addAnimal(Animal animal)
	{

		this.animals.add(animal);
		this.notifyAnimalAddedListeners(animal);
	}
}
