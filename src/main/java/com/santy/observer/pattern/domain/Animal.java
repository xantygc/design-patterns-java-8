/**
 *
 */
package com.santy.observer.pattern.domain;

/**
 * @author santy
 *
 */
public class Animal
{
	private String name;

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	public Animal(String name)
	{
		super();
		this.name = name;
	}

}
