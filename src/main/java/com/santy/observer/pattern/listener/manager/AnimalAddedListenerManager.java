/**
 *
 */
package com.santy.observer.pattern.listener.manager;

import com.santy.observer.pattern.listener.AnimalAddedListener;

/**
 * The Class AnimalAddedListenerManager.
 *
 * @author santy
 */
public class AnimalAddedListenerManager
{

	/** The listener. */
	private final AnimalAddedListener listener;

	/**
	 * Instantiates a new animal added listener manager.
	 *
	 * @param listener
	 *            the listener
	 */
	public AnimalAddedListenerManager(AnimalAddedListener listener)
	{
		this.listener = listener;
	}

	/**
	 * Gets the listener.
	 *
	 * @return the listener
	 */
	public final AnimalAddedListener getListener()
	{
		return this.listener;
	}
}
