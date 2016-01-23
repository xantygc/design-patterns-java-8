package es.com.observer.test;

import org.junit.Test;

import com.santy.observer.pattern.domain.Animal;
import com.santy.observer.pattern.domain.Zoo;
import com.santy.observer.pattern.listener.AnimalAddedListener;
import com.santy.observer.pattern.listener.impl.CountingAnimalAddedListener;
import com.santy.observer.pattern.listener.impl.PrintNameAnimalAddedListener;

public class AnimalListenerTest
{

	@Test
	public void addAnimalTest()
	{
		// Create the zoo to store animals
		Zoo zoo = new Zoo();
		// Register a listener to be notified when an animal is added
		zoo.registerAnimalAddedListener(new PrintNameAnimalAddedListener());
		// Add an animal notify the registered listeners
		zoo.addAnimal(new Animal("Tiger"));
	}

	@Test
	public void addMultipleAnimalsTest() throws Exception
	{

		Zoo zoo = new Zoo();

		zoo.registerAnimalAddedListener(new PrintNameAnimalAddedListener());
		zoo.registerAnimalAddedListener(new CountingAnimalAddedListener());

		zoo.addAnimal(new Animal("Tiger"));
		zoo.addAnimal(new Animal("Lion"));
		zoo.addAnimal(new Animal("Bear"));
	}

	@Test
	public void addAnimalWithCreationOfListenerTest() throws Exception
	{
		// Create the zoo to store animals
		Zoo zoo = new Zoo();
		// Register listeners to be notified when an animal is added
		AnimalAddedListener listener = zoo.registerAnimalAddedListener((animal) -> System.out.println("Added a new animal with name '"
				+ animal.getName() + "'"));

		zoo.addAnimal(new Animal("Tiger"));

		zoo.unregisterAnimalAddedListener(listener);

		zoo.addAnimal(new Animal("Lion"));
	}

	@Test
	public void addAnimalWithLambdasTest() throws Exception
	{

		Zoo zoo = new Zoo();

		zoo.registerAnimalAddedListener((animal) -> System.out.println("Added a new animal with name '" + animal.getName() + "'"));

		zoo.addAnimal(new Animal("Tiger"));
	}
}
