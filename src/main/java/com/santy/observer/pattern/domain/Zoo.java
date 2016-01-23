/**
 *
 */
package com.santy.observer.pattern.domain;

import java.util.ArrayList;
import java.util.List;

import com.santy.observer.pattern.listener.AnimalAddedListener;
import com.santy.observer.pattern.listener.manager.AnimalAddedListenerManager;

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
	 * @return the animal added listener
	 */
	public AnimalAddedListener registerAnimalAddedListener(AnimalAddedListener listener)
	{
		this.listeners.add(listener);
		return listener;
	}

	/**
	 * Register animal added listener2.
	 *
	 * @param listener
	 *            the listener
	 * @return the animal added listener manager
	 */
	public AnimalAddedListenerManager registerAnimalAddedListener2(AnimalAddedListener listener)
	{
		this.listeners.add(listener);
		return new AnimalAddedListenerManager(listener);
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

	public void unregisterAnmialAddedListener(AnimalAddedListenerManager manager)
	{
		this.listeners.remove(manager.getListener());
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
